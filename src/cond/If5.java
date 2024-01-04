package cond;

public class If5 {
    public static void main(String[] args) {
        int item=10000;
        int age=20;
        int cost=12000;
        if (item>=10000){
            cost-=1000;
        }
        if (age<=10){
            cost-=1000;
        }
        System.out.println(cost
        );
    }
}
