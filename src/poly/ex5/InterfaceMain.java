package poly.ex5;




public class InterfaceMain {
    public static void main(String[] args) {
        // 인터페이스 생성 불가.
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();
        soundAnimal(cat);
        soundAnimal(cow);
        soundAnimal(dog);
    }
    private static void soundAnimal(InterfaceAnimal animal){
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 끝");
    }
}
