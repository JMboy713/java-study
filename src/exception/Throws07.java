package exception;

import java.io.FileWriter;
import java.io.IOException;

public class Throws07 {
    public static void main(String[] args)  {
        try {
            writeFile(); // main에서 예외처리를 해보림.
        } catch (IOException e) { // 예외를 catch해서 처리
            e.printStackTrace();
            System.out.println("메인 메서드에서 해결");
        }

    }
    public static void writeFile() throws IOException {
//        try {
//            FileWriter writer = new FileWriter("test.txt"); // 파일 객체 만들기
//            throw new IOException("파일 쓰기에 실패했어요"); // 강제로 예외 발생
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("write파일 메서드에서 자체 해결");
//        }
        FileWriter writer = new FileWriter("test.txt"); // 파일 객체 만들기
        throw new IOException("파일 쓰기에 실패했어요"); // 강제로 예외 발생
    }
}
