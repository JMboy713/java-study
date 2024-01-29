package pack;

import pack.a.User;


public class PackageMain3 {
	public static void main(String[] args) {
		User userA = new User();
		pack.b.User userB = new pack.b.User(); // 둘중 하나는 모두 적어주어야 한다. 		
	}
}
