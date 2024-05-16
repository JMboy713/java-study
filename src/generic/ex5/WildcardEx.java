package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {
    static <T> void printGenericV1(Box<T> box) { // T의 타입
        System.out.println("T : " + box.get());
    }

    static void printWildcardV1(Box<?> box) {
        System.out.println("? : " + box.get());
    }
    static <T extends Animal> void printGenericV2(Box<T> box) { // T의 상한 -Animal
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }
    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {// print 하고 return
        T t = box.get();
        System.out.println("t = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("animal = " + animal.getName());
        return animal;
    }

}
