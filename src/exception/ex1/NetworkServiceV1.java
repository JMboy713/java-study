package exception.ex1;

public class NetworkServiceV1 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworklClientV1 client = new NetworklClientV1(address);
        client.initError(data);
        client.connect();
        client.send(data);
        client.disconnect();

    }
}
