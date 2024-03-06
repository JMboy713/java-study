package exception;

public class CustomException06 {
    // Exception을 상속받아서 cutsomException을 만들 수 있다.
    public static void main(String[] args) {
        int age = 17;// 만나이 17세
        try {
            if (age < 19) {
                throw new AgeLessThan19Exception("만 19세 미만에게 판매하지 않습니다.");
            }else{
                System.out.println("주문하신 상품 여깄습니다.");
            }
        }catch (AgeLessThan19Exception e) {
            System.out.println("조금 더 나이를 먹어주세요");
        }catch (Exception e) {
            System.out.println("모든 예외를 처리합니다");
        }
    }
}

class AgeLessThan19Exception extends Exception {
    public AgeLessThan19Exception(String message) {
        super(message);
    }
}


