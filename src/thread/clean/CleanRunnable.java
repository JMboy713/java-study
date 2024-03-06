package thread.clean;

public class CleanRunnable implements Runnable{ // implements 는 다중 상속이 가능하다. 상속을 받고 난 후에 runnable 이 필요하다면 interface를 사용해 준다.
    @Override
    public void run() {
        System.out.println("직원 청소 시작( Runnable )");
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("(직원)" + i + "번방 청소중");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("-- 직원 청소 끝 --");
    }
}
