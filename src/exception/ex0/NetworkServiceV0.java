package exception.ex0;

public class NetworkServiceV0 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworklClientV0 client = new NetworklClientV0(address);
        client.connect();
        client.send(data);
        client.disconnect();

    }
}
