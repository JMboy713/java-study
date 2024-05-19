package collection.list.test.ex2;

import java.util.ArrayList;

public class ShoppingCartMain {
    public static void main(String[] args) {

        ShoppingCart<Item> cart = new ShoppingCart<>();
        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();

    }

    protected static class ShoppingCart<E extends Item> {
        private ArrayList<E> cart;

        public ShoppingCart() {
            this.cart = new ArrayList<>();
        }

        public void addItem(E item) {
            cart.add(item);
        }

        public void displayItems() {
            System.out.println("장바구니 상품 출력");
            int totalSum = 0;
            for (E item : cart) {
                System.out.println("상품명: " +item.getName() +", 합계: "+item.getTotalPrice());
                totalSum += item.getTotalPrice();
            }
            System.out.println("전체 가격 합: " + totalSum);
        }


    }
}
