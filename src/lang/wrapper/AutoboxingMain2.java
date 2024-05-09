package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        // primitive -> wrapper
        int value = 7;
        Integer i = value;

        int unboxedValue = i;
        System.out.println(unboxedValue);
        System.out.println("i = " + i);

    }
}
