package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;


public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 50);

        dogHospital.set(dog);
        catHospital.set(cat);

        dogHospital.checkup();
        catHospital.checkup();

        // 문제 1: 개병원에 고양이 전달.
        //dogHospital.set(cat);

        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("다리미", 70));
        System.out.println("더 큰 개: " + biggerDog);


    }
}
