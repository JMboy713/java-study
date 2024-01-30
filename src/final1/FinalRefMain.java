package final1;

public class FinalRefMain {
	public static void main(String[] args) {
		final Data data = new Data(); // 참조값을 변경 못한다. 안의 변수는 변경 가능. 
		// data = new Data() // final 변경 불가. 

		// 참조 대상의 객체 값은 변경이 가능하다. 
		data.value=10;
		System.out.println(data.value);
		data.value=20;
		System.out.println(data.value);
	}
}
