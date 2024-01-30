package extends1.super2;

public class ClassB extends ClassA {
	public ClassB(int a){

		super();// 기본 생성자 생략 가능 => 매개변수가 없으면 안적어줘도 된다.
		System.out.println("class b 생성자 a = "+a);
	}

	public ClassB(int a,int b){
		super();
		System.out.println("class B 생성자 a="+a+" b="+b);
	}
}
