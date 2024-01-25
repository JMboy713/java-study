package oop;

public class ValueObjectMain {
	public static void main(String[] args) {
		ValueData data = new ValueData();
		data.add();// method 를 사용.
		data.add();
		data.add();
		System.out.println("최종 data.value=" + data.value);
	}
}