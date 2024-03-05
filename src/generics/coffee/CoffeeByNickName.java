package generics.coffee;

public class CoffeeByNickName {
    private String nickName;

    public CoffeeByNickName(String nickName) {
        this.nickName = nickName;
    }
    public void ready(){
        System.out.println("커피준비 완료 : " + nickName );
    }
}
