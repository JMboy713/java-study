package ref;

public class MethodChange2 {
	
	public static void main(String[] args) {
		Data d = new Data();
		d.value = 10;
		System.out.println("d.value = " + d.value);
		change(d);
		System.out.println("d.value = " + d.value);

	}

	public static void change(Data d) {
		d.value = 20;// 참조하는 인스턴스의 값을 바꾸어 버렸다. 
		
	}
}
