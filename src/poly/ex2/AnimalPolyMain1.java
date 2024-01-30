package poly.ex2;

public class AnimalPolyMain1 {
	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();
		soundAnimal(dog); // 부모에 자식을 담을 수 있다.  
		soundAnimal(cat);
		soundAnimal(cow);

	}
	private static void soundAnimal(Animal animal){
		System.out.println("동물 소리 테스트 시작");
		animal.sound(); // 메서드 오버라이딩 때문에 우선 순위를 가진다. 
		System.out.println("동물 소리 테스트 끝");

	}
}
