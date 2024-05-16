package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 50);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog dog1 = new Dog("킁 멍멍이", 20);
        Dog bigger = AnimalMethod.getBigger(dog, dog1);
        System.out.println("bigger = " + bigger);

    }
}
