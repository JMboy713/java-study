package poly.ex6;

public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("쨱 쨱");
    }

    @Override
    public void fly() {
        System.out.println("날 수 있습니다.");
    }
}
