package lang.object.tostring;

import lang.object.poly.Car;
import lang.object.poly.Dog;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car();
        Dog dog1=new Dog("Buddy", 3);
        Dog dog2=new Dog("dog1",2);

        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println("Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);
    }
}
