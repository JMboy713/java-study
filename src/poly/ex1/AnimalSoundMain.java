package poly.ex1;

public class AnimalSoundMain {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();
		
		System.out.println("동물 소리 테스트"); // 중복
		dog.sound();
		System.out.println("동물 소리 테스트 끝");
		System.out.println("동물 소리 테스트");
		
		cat.sound();
		System.out.println("동물 소리 테스트 끝");
		System.out.println("동물 소리 테스트");
		cow.sound();
		System.out.println("동물 소리 테스트 끝");

		
	}
	private static void soundCow(Cow cow){
		System.out.println("동물 소리 테스트");
		cow.sound();
		System.out.println("동물 소리 테스트 끝");
	}
}
