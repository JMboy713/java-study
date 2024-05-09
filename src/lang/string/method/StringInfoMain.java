package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello java";
        System.out.println("Length of the string: " + str.length());
        System.out.println("문자열 비어있는지" + str.isEmpty());
        System.out.println("문자열이 비어있거나 공백인지" + str.isBlank());
        System.out.println("문자열이 Hello로 시작하는지: " + str.startsWith("Hello"));
        char c = str.charAt(6);
        System.out.println("6번째 문자: " + c);


    }
}
