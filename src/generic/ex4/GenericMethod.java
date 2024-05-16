package generic.ex4;

public class GenericMethod {
    public static Object objMethod(Object obj) {
        System.out.println("GenericMethod.objMethod");
        return obj;
    }
    public static <T> T genericMethod(T obj) {
        System.out.println("GenericMethod.genericMethod");
        return obj;
    }

    public static <T extends Number> T numberMethod(T obj) {
        System.out.println("GenericMethod.numberMethod");
        return obj;
    }
}
