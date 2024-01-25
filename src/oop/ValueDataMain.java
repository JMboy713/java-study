package oop;

public class ValueDataMain {
	public static void main(String[] args) {
		ValueData data = new ValueData();
		add(data);
		add(data);
		add(data);
		System.out.println("최종 data.value=" + data.value);

	}
	static void add(ValueData data) {
		data.value++;
		System.out.println("data.value=" + data.value);
	}
}
