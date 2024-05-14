package exception.ex4.exception;

public class NetworkService {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);
        try {
            client.connect();
            client.send(data);
        }finally {
        client.disconnect();
        }

    }
}
