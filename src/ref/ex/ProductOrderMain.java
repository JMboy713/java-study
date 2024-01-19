package ref.ex;

import java.util.Scanner;

public class ProductOrderMain {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	System.out.println("몇개를 입력 받을건가요 ");
    int index =sc.nextInt();;
	sc.nextLine();
    ProductOrder[] orders = new ProductOrder[index];
	int count=0;
    while (true) {
      System.out.println(
        "1. 주문 생성 , 2. 상품 주문 정보 출력 , 3. 총 결제 금액 계산."
      );
      int select = sc.nextInt();
      sc.nextLine();
      if (select == 1) {
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("가격: ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.print("개수: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        orders[count] = createOrder(name, price, quantity);
        count += 1;
      } else if (select == 2) {
        printOrders(orders);
      } else if (select == 3) {
        System.out.println("최종 결제 금액은 :" + getTotalAmount(orders));
        break;
      }
    }
  }

  static ProductOrder createOrder(String productName, int price, int quantity) {
    ProductOrder product = new ProductOrder();
    product.productName = productName;
    product.price = price;
    product.quantity = quantity;
    return product;
  }

  static void printOrders(ProductOrder[] orders) {
    for (ProductOrder order : orders) {
      System.out.println("name is" + order.productName);
      System.out.println("price" + order.price);
      System.out.println("quantity is " + order.quantity);
    }
  }

  static int getTotalAmount(ProductOrder[] orders) {
    int totalCost = 0;
    for (ProductOrder po : orders) {
      totalCost += (po.price * po.quantity);
    }
    return totalCost;
  }
}
