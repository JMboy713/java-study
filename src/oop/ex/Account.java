package oop.ex;

public class Account {
	int balance;// 잔액
	int amount;
	// method
	int deposit(int amount){
		return balance+amount;
	}
	int withdraw(int amount){
		if( (balance-amount)>0){
			return (balance-amount);
		}else{
			System.out.println("잔액이 부족합니다.");
			return balance;
		}
	}
}
