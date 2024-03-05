package generics;

import generics.coffee.*;
import generics.user.User;
import generics.user.VipUser;

public class _02_GenericsClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();
        CoffeeByNickName c2 = new CoffeeByNickName("유재석");
        c2.ready();
        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("-----------");

        int c3Name = (int)c3.name;// object 라 형변환 필요
        System.out.println("주문고객번호 : " + c3Name);

        String c4Name = (String)c4.name;// object 라 형변환 필요
        System.out.println(c4Name);

        // c4Name = (String) c3.name; // 에러. 형변환 불가능

        System.out.println("-----------");

        // 제네릭 클래스
        Coffee<Integer> c5 = new Coffee<Integer>(35);
        c5.ready();

        Coffee<String> c6 = new Coffee<String>("정형돈");
        c6.ready();

        int c5Name = c5.name;// 형변환 불필요
        System.out.println("-----------");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VipUser("이수근"));
        c8.ready();

        System.out.println("-----------");
        orderCoffee("김영철");

        orderCoffee("김희철","아메리카노");



    }

    public static <T> void orderCoffee(T name){
        System.out.println("커피 준비 완료 : " + name);

    }
    public static <T,V> void orderCoffee(T name,V coffee){
        System.out.println("커피 "+coffee +"준비 완료 : " + name);

    }
}

