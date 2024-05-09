package lang.string;

public class CharArrayMain {
    public static void main(String[] args) {
        char[] arr = new char[]{'a', 'b', 'c', 'd', 'e'};
        String str = new String(arr);

        System.out.println(arr);
        System.out.println(str);
    }
}
