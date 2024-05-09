package lang.quiz;

public class WapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        Integer i = Integer.valueOf(str);// Integer
        int i1 = i.intValue();
        System.out.println(i);
        System.out.println(i1);
        Integer i2 = Integer.valueOf(i1);
        System.out.println(i2);
    }
}
