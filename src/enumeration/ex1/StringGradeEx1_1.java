package enumeration.ex1;

import enumeration.ex1.DiscountService;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int discountPrice = discountService.discount(StringGrade.BASIC, price);
        System.out.println("할인된 가격: " + discountPrice);
        int discountPrice2 = discountService.discount(StringGrade.GOLD, price);
        System.out.println("할인된 가격: " + discountPrice2);
        int discountPrice3 = discountService.discount(StringGrade.DIAMOND, price);
        System.out.println("할인된 가격: " + discountPrice3);

    }
}
