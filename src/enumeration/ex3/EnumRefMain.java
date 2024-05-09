package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("BASIC: " + Grade.BASIC.getClass());
        System.out.println("GOLD: " + Grade.GOLD.getClass());
        System.out.println("ref basic"+Grade.BASIC);
        System.out.println("ref basic"+refValue(Grade.BASIC));

        System.out.println("DIAMOND: " + Grade.DIAMOND.getClass());
    }

    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
