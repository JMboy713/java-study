package extends1.access.child;

import extends1.access.parent.Parent;;

public class Child extends Parent{
	public void call(){
		publicValue=1;
		protectedValue=1; // 상속 관계 or 같은 패키지.
		// defaultValue =1; 다른 패키지
		// privateValue = 1; 접근 불가

		publicMethod();
		protectedMethod();
		// defaultMethod();

		printParent();// public으로 메서드에 접근이 가능하고 이후 같은 패키지 이기 때문에 접근이 가능하다.
	}
}
