package poly.ex3;

public abstract class AbstractAnimal {
    public abstract void sound(); // 호출이 될 수 없다. -> 오버라이딩 되어야 한다.
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
