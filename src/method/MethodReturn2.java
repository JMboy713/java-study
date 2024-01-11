package method;
import java.util.Scanner;
public class MethodReturn2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int age=scanner.nextInt();
		if(checkAdult(age)){
			System.out.println("입장하세요");
		}else{
			System.out.println("미성년자는 입장이 불가합니다. ");
		}
	}
	public static boolean checkAdult(int a){
		if(a>=18){
			return true;
		}else{
			return false;
		}
	}
}
