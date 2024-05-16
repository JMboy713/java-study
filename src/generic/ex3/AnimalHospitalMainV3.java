package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        // 문제 1: 개병원에 고양이 전달.
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 50);

        dogHospital.set(dog);
        catHospital.set(cat);

        dogHospital.checkup();
        catHospital.checkup();

        //dogHospital.set(cat);

        // 개 타입으로 캐스팅 필요.
        dogHospital.set(dog);
        Dog biggerDog = (Dog)dogHospital.getBigger(new Dog("다리미", 70));
        System.out.println("더 큰 개: " + biggerDog);


    }
}
