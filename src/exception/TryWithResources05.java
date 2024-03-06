package exception;

import java.io.BufferedWriter;

public class TryWithResources05 {
    public static void main(String[] args) {
        MyFileWriter writer1 = null;
        try{
            writer1 = new MyFileWriter();
            writer1.write("아이스크림이 먹고싶어요");
        }catch (Exception e){
            e.printStackTrace();
    }finally {
            try {
                writer1.close();// close 에 대한 예외처리가 되어있지 않음.
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("=====================================");
        // close 가 필요한 경우 try with resources 를 사용한다.
        // 자동으로 닫는 것까지 처리해준다.
        try(MyFileWriter writer2 = new MyFileWriter()) { //  close 를 자동으로 처리 -> autoCloseable 을 구현한 클래스만 사용가능
            writer2.write("빵이 먹고싶어요");
        }catch (Exception e){
            e.printStackTrace();
        }

        BufferedWriter bufferedWriter = null;
    }
}

class MyFileWriter implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다.");
    }
    public void write(String line){
        System.out.println("파일의 내용을 입력합니다.");
        System.out.println("입력한 내용 : " + line);
    }
}