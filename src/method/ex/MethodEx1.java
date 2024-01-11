package method.ex;
import java.util.Scanner;
public class MethodEx1 {

  public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	while(true){
	System.out.println("평균을 구하고 싶은 숫자 3개를 작성하시오 :");
	int a=scanner.nextInt();
	int b=scanner.nextInt();
	int c=scanner.nextInt();
	if (a==0 || b==0||c==0){
		break;
	}
    System.out.println("평균값: " + avg(a, b, c));

}
  }
  public static double avg(int a,int b,int c){
	int sum=a+b+c;
	double average=sum/3.0;
	return average;
  }
}
