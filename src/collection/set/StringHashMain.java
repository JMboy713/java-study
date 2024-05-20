package collection.set;

public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        char charA = 'A';
        char charB = 'B';
        System.out.println(charA + " : " + (int)charA);

        //hashCode
        System.out.println(hashCode("A"));

        System.out.println(hashIndex(hashCode("A")));

    }
    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c;
        }
        return sum ;
    }
    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
