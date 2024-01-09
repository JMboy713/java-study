package scanner;

import java.util.Scanner;

public class Scanner4 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int sum=0;
		while(true){
			System.out.print("더하고 싶은 숫자를 입력하세요. 마지막은 0을 입력하세요 : ");
			int num=scanner.nextInt();
			if (num==0){
				break;
			}else{
				sum+=num;
			}
			
		}
		System.out.println("sum is "+ sum);
	}
	
}
