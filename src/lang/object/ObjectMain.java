package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();
        child.toString();
        System.out.println(child.hashCode());
        System.out.println(child.getClass());


        Parent parent = new Parent();
        parent.parentMethod();
        parent.toString();
        System.out.println(parent.hashCode());
        System.out.println(parent.getClass());
        System.out.println(parent.equals(parent));


    }
}
