package generic.ex3.unit;

public class UnitPrinter {

    static <T extends BioUnit> void printUnitV1(Shuttle<T> t1) {
        T out = t1.out();
        System.out.println(out);

    }
    static void printUnitV2(Shuttle<?> shuttle) {
        shuttle.showInfo();
    }
}
