package lang.string.builder;

public class StringBuilderMain1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("Bdd");
        sb.append("C");
        System.out.println(sb);
        sb.insert(2, "java");
        System.out.println(sb);
        sb.delete(1, 3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        String string = sb.toString();
        System.out.println(string);
    }
}
