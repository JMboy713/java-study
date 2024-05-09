package lang.string.quiz;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] split = email.split("@");
        String domain = split[1];
        String ID = split[0];
        System.out.println(ID);
        System.out.println(domain);

    }
}
