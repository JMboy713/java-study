package method.ex;

import java.util.Scanner;;

public class MethodEx3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int balance=0;
		while(true){
			System.out.print("1:입금 2:출금 3: 잔액확인 4:종료 ");
			int input=scanner.nextInt();
			if (input==1){
				System.out.println("얼마를 입금하시겠습니까?");
				int depositAmount=scanner.nextInt();
				balance=deposit(balance,depositAmount);
				System.out.println(depositAmount+"원을 입금하였습니다. 현재 잔액 : "+balance);

			}else if(input==2){
				System.out.println("얼마를 출금하시겠습니까?");
				int withdrawAmount=scanner.nextInt();
				if(withdraw(balance,withdrawAmount)==-1){
					System.out.println(withdrawAmount+"원을 출금하려 했으나 잔액부족으로 출금이 불가합니다.");
				}else{
					balance=withdraw(balance,withdrawAmount);
					System.out.println(withdrawAmount+"원을 출금하였습니다. 현재 잔액: "+balance);
				}
			}else if(input==3){
				System.out.println("현재 잔액: "+balance);

			}else if(input==4){
				System.out.println("프로그램을 종료합니다.");
				break;
			}else{
				System.out.println("잘못된 선택입니다.");
			}

		}
	}
	public static int deposit(int balance, int input) {
		return balance+input;
		
	}
	public static int withdraw(int balance, int output) {
		if ((balance-output>=0)){
			return balance-output;
		}else{
			return -1;
		}
		
		
	}
}
