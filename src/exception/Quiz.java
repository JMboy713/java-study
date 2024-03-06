package exception;

import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("에러 코드 : ");
        int errorCode = sc.nextInt();
        try{
            if(errorCode ==1){
                throw new ProductTimeException("상품 구매 가능 시간이 아닙니다."); // 예외 객체 생성 메세지
            } else if (errorCode == 2) {
                throw new ProductSoldOutException("해당 상품은 매진되었습니다.");
            }else{
                System.out.println("상품 구매를 완료하였습니다.");
                }
            }catch (ProductTimeException e){
            System.out.println(e.getMessage());
                System.out.println("상품 구매는 20시부터 가능합니다."); // 예외 처리 메세지
            }catch (ProductSoldOutException e) {
            System.out.println(e.getMessage());
               System.out.println("해당 상품은 매진되었습니다.");
        }
        }

    }




// 발생 가능 2가지 조건 : 상품 구매 가능 시간, 상품 매진
// 1번 에러 - 상품 구매 가능 시간이 아님.
// 2번 에러 - 매진됨.

class ProductSoldOutException extends Exception {// 매진 예외
    public ProductSoldOutException(String message) {
        super(message); // 예외 객체 생성 메세지
    }
}

class ProductTimeException extends Exception {// 시간 예외
    public ProductTimeException(String message) {
        super(message);
    }
}