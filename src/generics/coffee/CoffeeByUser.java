package generics.coffee;

import generics.user.User;

public class CoffeeByUser <T extends User>{ // user를 상속받는것만 들어올 수 있음.
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready(){
        System.out.println("커피준비 완료 : " + user.name );
        user.addPoint();
    }



}
