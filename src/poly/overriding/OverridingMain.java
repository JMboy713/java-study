package poly.overriding;

public class OverridingMain {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println("Child -> child");
		System.out.println("value = "+child.value);

		child.method();

		// 부모 변수가 부모 인스턴스 참조
		Parent parent =new Parent();
		System.out.println("Parent -> Parent");
		System.out.println("value ="+parent.value);
		parent.method();

		// 부모 변수가 자식 인스턴스 참조 ( 다형적참조 )

		Parent poly = new Child();
		System.out.println("Parent -> Child");
		System.out.println("Value = "+ poly.value);// 변수는 오버라이딩 x
		poly.method();// 메서드 오버라이딩

	}
}
