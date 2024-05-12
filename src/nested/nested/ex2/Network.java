package nested.nested.ex2;

public class Network {
    public void sendMessage(String message) {
        NetworkMessage networkMessage = new NetworkMessage(message);
        networkMessage.print();
    }
    public static class NetworkMessage { // 객체 생성 불가.
        private String content;
        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}
