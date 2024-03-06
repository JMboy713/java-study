package exception;

public class Finally04 {
    public static void main(String[] args) {
        try{
            System.out.println("택시의 문을 연다.");
            throw new Exception("휴무 택시");
//            System.out.println("택시에 탑승한다.");
        }catch (Exception e){
            System.out.println("!! 문제 발생 " + e.getMessage());
        }finally {// 무조건 실행
            System.out.println("택시의 문을 닫는다.");
        }// finally 는 파일을 열었다면 닫을때, db를 연결했을때 연결을 끊을때 주로 사용한다.

        System.out.println("=======================");
        try{
            System.out.println(3/0);
        }finally {
            System.out.println("프로그램 정상 종료"); // 에러가 발생해도 finally 는 실행된다.
        }




    }
}
