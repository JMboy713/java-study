package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animl = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 10);
        Cat 야옹이 = new Cat("야옹이", 5);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog dog1 = dogBox.get();
        System.out.println( "find dog"+dog1);

        Box<Cat> catBox = new Box<>();
        catBox.set(야옹이);
        Cat cat = catBox.get();
        System.out.println( "find cat"+cat);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(dog);
        Animal animal = animalBox.get();
        System.out.println(animal.getClass());

        System.out.println( "find animal"+animal);
        
    }
}
