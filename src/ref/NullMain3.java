package ref;

public class NullMain3 {
	
	public static void main(String[] args) {
		BigData bigData=new BigData();
		System.out.println("bigData.data="+bigData.data);
		System.out.println("bigData.count="+bigData.count);

		// bigData.data=new Data();// 새로운 참조값을 준다.
		bigData.data.value=10; // 2번 찾아감.
		System.out.println(bigData.data.value);
	}
}
