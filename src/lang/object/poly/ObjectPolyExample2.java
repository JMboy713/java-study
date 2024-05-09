package lang.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Car car = new Car();
        Object object = new Object();

        Object[] objects = {dog, car, object};
        size(objects);
        System.out.println(dog);
        System.out.println(car);

        }
    private static void size(Object[] objects){
        System.out.println("objects.length = " + objects.length);
    }
    }

