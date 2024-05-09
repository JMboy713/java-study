package enumeration.ref2;


import static enumeration.ref2.Grade.*;

public class ClassGraderefMain2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(BASIC, price);
        int gold = discountService.discount(GOLD, price);
        int diamond = discountService.discount(DIAMOND, price);
        System.out.println("할인된 가격: " + basic);
        System.out.println("할인된 가격: " + gold);
        System.out.println("할인된 가격: " + diamond);

    }
}
