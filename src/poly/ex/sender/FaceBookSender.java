package poly.ex.sender;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String Message) {
        System.out.println("DM을 발송합니다."+Message);
    }
}
