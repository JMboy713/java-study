package enumeration.ex3;

public class EnumEx3_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int discountPrice = discountService.discount(Grade.BASIC, price);
        System.out.println("할인된 가격: " + discountPrice);
    }
}
