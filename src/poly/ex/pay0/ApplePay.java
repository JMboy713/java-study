package poly.ex.pay0;

public class ApplePay implements Payment{

    @Override
    public boolean pay(int amount) {
        System.out.println("해당 옵션으로는 결제가 되지 않습니다.");
        return false;
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

