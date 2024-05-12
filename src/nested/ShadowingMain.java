package nested;

public class ShadowingMain {
    public int value = 1;
    class Inner{
        public int value = 2;
        public void go() {
            int value = 3;
            System.out.println(value); // 3 메서드의 변수
            System.out.println(this.value); //2 인스턴스의 변수
            System.out.println(ShadowingMain.this.value);// 바깥 클래스의 변수
        }
    }

    public static void main(String[] args) {
        ShadowingMain main = new ShadowingMain();
        Inner inner = main.new Inner();
        inner.go();

    }

}
