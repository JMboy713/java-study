package scanner.ex;

import java.util.Scanner;

public class Ex5 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int totalCost = 0;
    while (true) {
      System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
      int input = scanner.nextInt();
      if (input == 1) {
        scanner.nextLine();
        System.out.print("상품명을 입력하세요: ");
        String stuff = scanner.nextLine();
        System.out.print("상품의 가격을 입력하세요: ");
        int price = scanner.nextInt();

        System.out.print("구매수량을 입력하세요");
        int count = scanner.nextInt();

        System.out.println(
          "상품명: " + stuff + "가격: " + price + "수량: " + count
        );
        totalCost += (price * count);
      } else if (input == 2) {
        System.out.println("총비용 : " + totalCost);
      }else if (input==3){
		System.out.println("프로그램을 종료합니다.");
		break;
	  } 
	  else {
        System.out.println("잘못된 숫자를 입력하셨습니다.");
      }
    }
  }
}
