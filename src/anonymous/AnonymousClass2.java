package anonymous;

public class AnonymousClass2 {
    public static void main(String[] args) {
        // 그때 그때 만들어서 사용하는 익명 클래스

        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        System.out.println("===================================");

        HomeMadeBurger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();
    }

    private static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("군대리아 버거를 만듭니다.");
                System.out.println("재료 : 빵, 소고기 패티, 양상추, 토마토, 치즈");
            }
        };
    }

    public static HomeMadeBurger getMomMadeBurger(){
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("엄마가 만든 버거를 만듭니다.");
                System.out.println("재료 : 빵, 소고기 패티");
            }
        };
    }

}


abstract class HomeMadeBurger{
    public abstract void cook();
}