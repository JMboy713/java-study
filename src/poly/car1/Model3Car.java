package poly.car1;

public class Model3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("model3 engine start");
    }

    @Override
    public void offEngine() {
        System.out.println("model3 engine off");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("model3 engine press");
    }
}
