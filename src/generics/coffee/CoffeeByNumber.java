package generics.coffee;

public class CoffeeByNumber {
    public int waitingNumber;

    public CoffeeByNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }

    public int getWaitingNumber() {
        return waitingNumber;
    }
    public void ready(){
        System.out.println("커피준비 완료 : " + waitingNumber );
    }
}
