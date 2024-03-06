package exception;

public class Catch02 {
    public static void main(String[] args) {
        try{
//            System.out.println(3/0);
            int[] arr = new int[3];
            arr[100] = 4;
//            Object obj = "test";
//            System.out.println((int) obj);
//            String s = null;
//            System.out.println(s.toLowerCase());
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException exception ){// 두개의 에러를 한번에 처리
            System.out.println("잘못 계산을 했습니다.");
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("인덱스를 잘못 설정했어요");
        }catch (ClassCastException e){
            System.out.println("캐스팅이 안돼요");
        }catch (Exception e){// 문제 발생시 catch 에서 실행
            System.out.println("그외의 모든 에러는 여기서 처리가 돼요 => "+ e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
