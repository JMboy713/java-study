package static1;

import static static2.DecoData.*;
public class DataCountMain3 {

  public static void main(String[] args) {
    Data3 data1 = new Data3("A");
    System.out.println("A count=" + Data3.count);
    Data3 data2 = new Data3("B");
    System.out.println("B count=" + Data3.count);
    Data3 data3 = new Data3("C");
    System.out.println("C count=" + Data3.count);

	// 추가
	// 인스턴스를 통한 접근
	Data3 data4 = new Data3 ("D");
	System.out.println(Data3.count); // 비추 -> 인스턴스 변수에 접근하는 것처럼 보일 수 있기 때문에 오해를 불러일으키기 쉽다.

	System.out.println(Data3.count);
  staticCall();

  }
}
