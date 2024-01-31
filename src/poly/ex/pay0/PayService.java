package poly.ex.pay0;

public class PayService {



    public static void processPay(Payment payment,int amount){
        boolean result;
        result=payment.pay(amount);
        payment.result(result);
    }
}
