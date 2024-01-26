package pack;

public class PackageMain1 {
	public static void main(String[] args) {
		Data data = new	Data(); // 같은 패키지에 있는건 이렇게 불러오면 된다.
		pack.a.User user = new pack.a.User();// 다른 패키지에서 불러오는 방법. 	
	}
	

}
