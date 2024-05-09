package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        // primitive -> wrapper
        int value = 7;
        Integer i = Integer.valueOf(value);

        int unboxedValue = i.intValue();
        System.out.println(unboxedValue);
        System.out.println("i = " + i);

    }
}
