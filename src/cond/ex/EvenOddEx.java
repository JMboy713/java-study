package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int x;
        x=11;
        String value=(x%2==0) ? "Even" : "Odd";
        System.out.println(x+" is a "+value);
    }
}
