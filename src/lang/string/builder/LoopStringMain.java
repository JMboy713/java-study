package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String result = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("java");
        }
        long end = System.currentTimeMillis();
        System.out.println(sb);
        System.out.println("String : " + (end - start) + "ms");
    }
}
