package enumeration.ref3;


import static enumeration.ref3.Grade.*;

public class ClassGraderefMain3 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = BASIC.discount(price);
        System.out.println("할인된 가격: " + basic);


    }
}
