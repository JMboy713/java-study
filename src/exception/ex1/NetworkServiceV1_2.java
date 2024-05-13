package exception.ex1;

public class NetworkServiceV1_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworklClientV1 client = new NetworklClientV1(address);
        client.initError(data);

        String connectResult = client.connect();
        if(isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류코드: " + connectResult);
            return;// 실패시 나가버림
        }
        String sendResult = client.send(data);
        if(isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류코드: " + sendResult);
            return;
        }
        client.send(data);
        client.disconnect();

    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
