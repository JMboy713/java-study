package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1= "Hello";
        String str2 = "hello, java";
        System.out.println(str1.compareTo(str2)); // -> 칸 차이를 알려줌.
        System.out.println("'a' compareTO'b' : " + "a".compareTo("b"));
    }
}
