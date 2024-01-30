package poly.basic;

public class CastingMain2 {
	public static void main(String[] args) {
		// 부모 변수가 자식 인스턴스 참조( 다형적 참조)
		Parent poly = new Child();
		// 단 자식의 기능은 호출 불가.

		// 다운 캐스팅 ( 부모 -> 자식으로 타입을 바꿈. )
		// Child child = (Child) poly;
		// child.childMethod();

		// 일시적 다운캐스팅 - 해당메서드를 호출하는 순간만 다운 캐스팅
		((Child) poly).childMethod();
	}
}
