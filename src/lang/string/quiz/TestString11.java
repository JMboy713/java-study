package lang.string.quiz;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello java";
        StringBuilder sb = new StringBuilder();
        sb.append(str).reverse();
        System.out.println(sb.toString());

    }
}
