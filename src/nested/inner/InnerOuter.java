package nested.inner;

public class InnerOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner{
        private int innerInstanceValue = 1;

        public void print() {
            // innerInstanceValue는 자신의 멤버이므로 접근 가능
            System.out.println(innerInstanceValue);
            // outInstanceValue는 바깥 클래스의 인스턴스 멤버이므로 접근 가능
            System.out.println(outInstanceValue);
            // outClassValue는 바깥 클래스의 클래스 멤버이므로 접근 가능
            System.out.println(outClassValue);
        }
    }
}
