package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospitalV1 = new AnimalHospitalV1();
        AnimalHospitalV1 catHospitalV1 = new AnimalHospitalV1();

        // 문제 1: 개병원에 고양이 전달.
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 50);

        dogHospitalV1.set(dog);
        catHospitalV1.set(cat);

        dogHospitalV1.checkup();
        catHospitalV1.checkup();

        dogHospitalV1.set(cat);

        // 개 타입으로 캐스팅 필요.
        dogHospitalV1.set(dog);
        Dog biggerDog = (Dog)dogHospitalV1.getBigger(new Dog("다리미", 70));
        System.out.println("더 큰 개: " + biggerDog);


    }
}
