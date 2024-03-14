package enumpack;

public class _10_enum {
    public static void main(String[] args) {
        // 열거형(Enum)
        // 달력 : Jan, FEB,MAR....
        Resolution resolution = Resolution.HIGH;
        System.out.println(resolution);
        // switch case 문을 많이 사용한다.
        switch(resolution){
            case LOW:
                System.out.println("저화질");
                break;
            case MEDIUM:
                System.out.println("중화질");
                break;
            case HIGH:
                System.out.println("고화질");
                break;
        }

        resolution = resolution.valueOf("LOW"); // low를 가져와서 resolution에 넣는다.
        System.out.println();
        for (Resolution r : Resolution.values()) {
            System.out.println(r.name()+":"+r.ordinal()); // 열거형 정의된 상수 순서.
        }

        System.out.println("-------------------");
        for (Resolution r : Resolution.values()) {
            System.out.println(r.name()+":"+r.getWidth()); // 열거형 정의된 상수 순서.
        }
    }
}


enum Resolution{
    LOW(1280), MEDIUM(1920), HIGH(2180);

    private final int width;
    Resolution(int width){
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
