package time;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {
    public static void main(String[] args) {
        ChronoField[] values = ChronoField.values();
        for (ChronoField value : values) {
            System.out.println(value+"|"+value.getBaseUnit()+"|"+value.range());
        }
        System.out.println("Hour of Day = " + ChronoField.HOUR_OF_DAY);
        System.out.println("Hour of Day range = " + ChronoField.HOUR_OF_DAY.range());
        System.out.println("Hour of Day base unit = " + ChronoField.HOUR_OF_DAY.getBaseUnit());
        System.out.println("Hour of Day range unit = " + ChronoField.HOUR_OF_DAY.getRangeUnit());
    }
}
