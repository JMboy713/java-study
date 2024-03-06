package exception;

public class TryCatch01 {
    public static void main(String[] args) {
        // 예외 처리
        // 오류 : 컴파일 오류, 런타임 오류 ( 에러 error, 예외 exception)
        // 컴파일 오류
//        int i = "문자열";// 컴파일 오류 .

        // 런타임 오류
//        int[] arr = new int[3];
//        arr[5] = 100;

            try{
//                System.out.println(3/0);
//                int[] arr = new int[3];
//                arr[100] = 4;
                Object obj = "test";
                System.out.println((int) obj);
            }catch (Exception e){// 문제 발생시 catch 에서 실행
                System.out.println("이런 문제가 발생했어요 => "+ e.getMessage());
                e.printStackTrace();
            }
        System.out.println("프로그램 정상 종료");

    }
}
