package exception.ex0;

public class NetworklClientV0 {
    private final String address;

    public NetworklClientV0(String address) {
        this.address = address;
    }

    public String connect() {
        System.out.println(address+ "서버 연결 성공");
        return "Success";
    }

    public String send(String data) {
        System.out.println(address + "서버에 데이터 전송 : " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address + "서버 연결 해제");
    }
}
