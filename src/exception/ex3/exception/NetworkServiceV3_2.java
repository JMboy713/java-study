package exception.ex3.exception;

public class NetworkServiceV3_2 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworklClientV3 client = new NetworklClientV3(address);
        client.initError(data);
        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("메세지: "+e.getMessage()+" [오류 코드]: "+ e.getAddress());
        }catch (NetworkClientExceptionV3 e) {
            System.out.println("메세지: "+e.getMessage());
        }catch (Exception e) {
            System.out.println("[알 수 없는 오류 발생]");
        }finally {
            client.disconnect();
        }



    }
}
