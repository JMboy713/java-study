package static1;

public class DataCountMain2 {
	public static void main(String[] args) {
		Counter counter = new Counter(); // counter 인스턴스를 공용으로 사용.
		Data2 data1 = new Data2("A",counter);
		System.out.println("A count="+counter.count);
		Data2 data2 = new Data2("B", counter);
		System.out.println("B count="+counter.count);

		Data2 data3 = new Data2("c", counter);
		System.out.println("C Count = "+counter.count);
	}
}
