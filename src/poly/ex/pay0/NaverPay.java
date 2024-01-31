package poly.ex.pay0;

public class NaverPay implements Payment{

    @Override
    public boolean pay(int amount) {
        System.out.println("네이버페이 시스템과 연결합니다.");
        System.out.println(amount+"원 결제를 시도합니다.");
        return true;
    }

    @Override
    public void result(boolean result) {
        if(result){
            System.out.println("결제가 성공했습니다.");
        }else{
            System.out.println("결제에 실패했습니다.");

        }
    }
}

