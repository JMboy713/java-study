package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str ="Hello";
        str.concat("World");
        System.out.println(str);

        String str2 = str.concat("World");
        System.out.println(str2);
    }
}
