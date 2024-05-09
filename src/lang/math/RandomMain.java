package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random(123);

        int randomInt = random.nextInt(10);
        System.out.println(randomInt);
        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println(randomBoolean);

        // 범위
        int randomRange1 = random.nextInt(10);//0~9
        System.out.println(randomRange1);

        int randomRange2 = random.nextInt(10) + 1;// 1~10
        System.out.println(randomRange2);
    }
}
