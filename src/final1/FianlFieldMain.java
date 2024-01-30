package final1;

public class FianlFieldMain {
	public static void main(String[] args) {
		System.out.println("생성자 초기화");
		Constructinit constructinit1 = new Constructinit(10);
		Constructinit constructinit2 = new Constructinit(20);
		System.out.println(constructinit1.value);
		System.out.println(constructinit2.value);

		// final 필드 - 필드 초기화 
		System.out.println("필드 초기화");
		Fieldinit fieldinit1 = new Fieldinit(); // 인스턴스의 필드 -> 고정된 값. 
		Fieldinit fieldinit2 = new Fieldinit();
		Fieldinit fieldinit3 = new Fieldinit();
		System.out.println(fieldinit1.value);
		System.out.println(fieldinit2.value);
		System.out.println(fieldinit3.value);
		/* 공통된 값을 사용하기 보다는 static 을 사용해서 공통된 값을 사용하자. */

		//상수
		System.out.println("상수");
		System.out.println(Fieldinit.CONST_VALUE);	// static 값
	}
}
