package class1.ex;

import java.util.Scanner;

public class ProductOrderMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇개의 주문을 받을까요?");
		int count=scanner.nextInt();
		ProductOrder[] orderlists=new ProductOrder[count];
		scanner.nextLine();
		int many=0;
		while (many<count){
				ProductOrder product=new ProductOrder();
				System.out.println("이름");
				product.productName=scanner.nextLine();
				System.out.println("가격");
				product.price=scanner.nextInt();
				scanner.nextLine();
				System.out.println("수량");
				product.quantity=scanner.nextInt();
				scanner.nextLine();
				orderlists[many]=product;
				many+=1;
			}
		
		int totalCost=0;
		// for(int i =0;i<orderlists.length;i++){
		// 	System.out.println("상품명: "+orderlists[i].productName+", 가격: "+orderlists[i].price+", 수량: "+orderlists[i].quantity);
		// 	totalCost+=orderlists[i].price*orderlists[i].quantity;
		// }
		for (ProductOrder order : orderlists) {
			System.out.println("상품명: "+order.productName+", 가격: "+order.price+", 수량: "+order.quantity);
			totalCost+=order.price*order.quantity;
		}
		System.out.println("총 결제 금액: "+totalCost);

	}
}
