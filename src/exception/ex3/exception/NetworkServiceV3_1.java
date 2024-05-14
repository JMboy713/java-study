package exception.ex3.exception;

import exception.ex2.NetworkClientExceptionV2;
import exception.ex2.NetworklClientV2;

public class NetworkServiceV3_1 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworklClientV3 client = new NetworklClientV3(address);
        client.initError(data);
        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("메세지: "+e.getMessage());

        }catch (SendExceptionV3 e) {
            System.out.println("메세지: "+e.getMessage());

        } finally {
            client.disconnect();
        }



    }
}
