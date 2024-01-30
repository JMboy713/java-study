package extends1.super2;

public class ClassC extends ClassB{
	public ClassC(){
		// super(); -> 기본 생성자일때만 가능하다. 
		super(10,20); // class B 에서 생성자를 직접 정의했기 때문에 기본으로 만들어 주지 않는다. (매개변수가 필요하다.)
		System.out.println("class C 생성자");
	}
}
