package lang.string.chaining;



public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder valueAdder = new ValueAdder();
        ValueAdder valueAdder1 = valueAdder.add(1);
        ValueAdder valueAdder2 = valueAdder1.add(2);
        ValueAdder valueAdder3 = valueAdder2.add(3);
        System.out.println(valueAdder.getValue());


    }
}
