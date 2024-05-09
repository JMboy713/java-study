package lang.immutable.quiz;

public class MyDate {
    private final int year;
    private final int month;
    private final int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate newYear(int year){
        return new MyDate(year, this.month, this.day);
    }
    public MyDate newMonth(int month){
        return new MyDate(this.year, month, this.day);
    }
    public MyDate newDay(int day){
        return new MyDate(this.year, this.month,day);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
