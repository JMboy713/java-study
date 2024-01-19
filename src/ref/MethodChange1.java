package ref;

public class MethodChange1 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println("a = " +a);
		change(a);
		System.out.println("a = " +a);

	}
	public static void change(int a) {
		a=20;
		
	}
		
}