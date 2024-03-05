package quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz10 {
    public static void main(String[] args) {
//        List<Customer> customers = List.of(
//                new Customer("챈들러", 50),
//                new Customer("레이첼", 42),
//                new Customer("모니카", 21),
//                new Customer("벤자민", 18),
//                new Customer("제임스", 5)
//        );
//        System.out.println("미술관 입장료 \n======================");
//        customers.stream().forEach(c->{
//            if (c.getAge() <19) {
//                System.out.println(c.getName() + "님의 입장료는 무료 입니다.");
//            }else{
//                System.out.println(c.getName() + "님의 입장료는 5000 원 입니다.");
//            }
//        });

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("챈들러", 50));
        customers.add(new Customer("레이첼", 42));
        customers.add(new Customer("모니카", 21));
        customers.add(new Customer("벤자민", 18));
        customers.add(new Customer("제임스", 5));

        System.out.println("미술관 입장료 \n======================");
        customers.stream().map(x->x.getAge() >=20? x.getName() + "님의 입장료는 5000 원 입니다." : x.getName() + "님의 입장료는 무료 입니다.").forEach(System.out::println);


    }
}
class Customer {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
