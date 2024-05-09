package lang.string.quiz;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        int i = str.indexOf(ext);
        String first = str.substring(0, i);
        String ex = str.substring(i);
        System.out.println(first);
        System.out.println(ex);


    }
}
