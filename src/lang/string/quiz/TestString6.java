package lang.string.quiz;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = 0;
        while (index >= 0) {
            index = str.indexOf(key, index);
            if (index >= 0) {
                count++;
                index += key.length();
            }
            System.out.println(index);
        }
        // 못찾으면 -1으로 준다.
        System.out.println(count);
    }
}
