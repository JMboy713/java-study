package lang.quiz;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};
        double num = 0;
        for (String s : array) {
            num+=Double.parseDouble(s);
        }
        System.out.println(num);
    }
}
