package poly.ex.pay0;

import java.util.Scanner;
public class PayMain0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("결제 수단을 입력하세요");
            String option = scanner.nextLine();
            System.out.println("결제 금액을 입력하세요");
            int amount = scanner.nextInt();
            scanner.nextLine();


            Payment pay1 = new KakaoPay();
            Payment pay2 = new NaverPay();
            Payment pay3 = new ApplePay();
            System.out.println(option);
            if (option.equals("kakao")) {
                PayService.processPay(pay1, amount);
            } else if (option.equals("naver")) {
                PayService.processPay(pay2, amount);
            } else {
                PayService.processPay(pay3, amount);
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }
    }
}
