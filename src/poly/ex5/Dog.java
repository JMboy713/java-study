package poly.ex5;

public class Dog implements InterfaceAnimal{// 인터페이스를 구현 할 때는 implements 라고 작성.
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
