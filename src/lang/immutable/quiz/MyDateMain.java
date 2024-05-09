package lang.immutable.quiz;

public class MyDateMain {
    public static void main(String[] args) {
        MyDate date = new MyDate(2010, 20, 30);

        System.out.println(date);
        MyDate date2 = date.newYear(2020);
        System.out.println(date2);
    }
}
