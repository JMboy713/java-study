package oop.ex;

public class AccountMain {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.balance=acc.deposit(10000);
		System.out.println("잔액 : "+acc.balance);
		acc.balance=acc.withdraw(9000);
		System.out.println("잔액 : "+acc.balance);
		acc.balance=acc.withdraw(2000);
		System.out.println("잔액 : "+acc.balance);
	}
}
