package scanner.ex;
import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1번");
		int a = scanner.nextInt();
		System.out.println("2번");
		int b= scanner.nextInt();
		if (a>b){
			int temp;
			temp=a;
			a=b;
			b=temp;
		}
		System.out.println(a+"and"+b);
		while(a<b){
			System.out.print(a+",");
			a++;
		}
		System.out.println(b);
	}
}
