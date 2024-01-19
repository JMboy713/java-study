package ref;



public class VarChange2 {

  public static void main(String[] args) {
    Data dataA = new Data();
    dataA.value = 10;
    Data dataB = dataA;
    System.out.println("dataA 참조값=" + dataA);// 참조값 a
    System.out.println("dataB 참조값=" + dataB);// 참조값 b ( a 와 같은 참조값을 가짐.)
    System.out.println("dataA.value = " + dataA.value);//10
    System.out.println("dataB.value = " + dataB.value);//10
    //dataA 변경
    dataA.value = 20;//a의 참조하는 인스턴스의 값이 20으로 바뀜
    System.out.println("변경 dataA.value = 20");
    System.out.println("dataA.value = " + dataA.value);
    System.out.println("dataB.value = " + dataB.value);
    //dataB 변경
    dataB.value = 30;
    System.out.println("변경 dataB.value = 30");
    System.out.println("dataA.value = " + dataA.value);
    System.out.println("dataB.value = " + dataB.value);
  }
}
