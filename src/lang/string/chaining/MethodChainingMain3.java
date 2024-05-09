package lang.string.chaining;



public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder valueAdder = new ValueAdder();
        valueAdder.add(1).add(2).add(3) ;

        int value = valueAdder.getValue();
        System.out.println(value);


    }
}
