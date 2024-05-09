package enumeration.ex2;

import enumeration.ex2.DiscountService;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(ClassGrade.BASIC, price);
        int gold = discountService.discount(ClassGrade.GOLD, price);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);
        System.out.println("할인된 가격: " + basic);
        System.out.println("할인된 가격: " + gold);
        System.out.println("할인된 가격: " + diamond);

    }
}
