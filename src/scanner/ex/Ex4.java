package scanner.ex;
import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("숫자를 입력하세요. 입력을 중단하렴녀 -1을 입력하세요.");
	int sum=0;
	int count=0;
	while(true){
		int num=scanner.nextInt();
		
		if (num==-1){
			break;
		}
		count++;
		sum+=num;
	}	
	double result=(double)sum/count;
	System.out.println("입력한 숫자들의 합계: "+sum);
	System.out.println("입력한 숫자들의 평균: "+result);

	}
}
