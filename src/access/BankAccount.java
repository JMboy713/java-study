package access;

public class BankAccount {
	private int balance;

	public BankAccount(){
		balance=0;
	}


	public void deposit(int amount){// 	입금
		if (isAmountValid(amount)) {
			balance+=amount;
			System.out.println("입금 완료. 잔액: "+balance);
	}else{
		System.out.println("유효하지 않은 금액입니다.");
	}
}
	public void withdraw(int amount){
		if(isAmountValid(amount)&&balance-amount>=0){ // and 조건
				balance-=amount;
				System.out.println("출금 완료. 잔액: "+balance);
			}else{
				System.out.println("잔액이 부족합니다.");
			}
	}

	public int getBalance(){
		return balance;
	}

	private boolean isAmountValid(int amount){
		return amount>0;
	}
}
