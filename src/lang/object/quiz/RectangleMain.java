package lang.object.quiz;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(10, 20);

        System.out.println(r1);
        System.out.println(r1 == r2);
        System.out.println(r1.equals(r2));
    }
}
