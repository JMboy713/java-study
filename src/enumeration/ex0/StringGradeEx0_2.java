package enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int discountPrice = discountService.discount("BASIC1", price);
        System.out.println("할인된 가격: " + discountPrice);
        int discountPrice2 = discountService.discount("GOLD", price);
        System.out.println("할인된 가격: " + discountPrice2);
        int discountPrice3 = discountService.discount("DIAMOND", price);
        System.out.println("할인된 가격: " + discountPrice3);

    }
}
