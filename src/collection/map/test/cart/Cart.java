package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int count) {
        cartMap.put(product, count);

    }

    public void printAll(){
        System.out.println("==모든 상품 출력 ==");
        for (Map.Entry<Product, Integer> productIntegerEntry : cartMap.entrySet()) {
            System.out.println("상품 " + productIntegerEntry.getKey() + " 수량 : " + productIntegerEntry.getValue());
        }
    }

    public void minus(Product product, int count) {
        Integer left = cartMap.get(product);
        if (left - count <= 0) {
            cartMap.remove(product);
        }else{
            cartMap.put(product, left - count);
        }
    }

}
