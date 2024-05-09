package lang.quiz;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";
        Integer i = Integer.valueOf(str);

        int i1 = i;

        Integer i2 = i1;

        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
    }
}
