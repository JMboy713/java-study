package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + str2;
        String result = str1.concat(str2);
        System.out.println(str3);
        System.out.println(result);
    }
}
