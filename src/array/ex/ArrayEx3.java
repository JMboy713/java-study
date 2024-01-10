package array.ex;
import java.util.Scanner;
public class ArrayEx3 {
	public static void main(String[] args) {
		System.out.println("몇개의 정수를 입력할까요? : ");
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int[] array;
		array=new int[a];
		System.out.println(a+"개의 정수를 입력해주세요.");
		for(int i=0;i<5;i++){
			array[i]=scanner.nextInt();
		}
		System.out.println("입력한 정수를 역순으로 출력 : ");
		for(int i=(array.length-1);i>=0;i--){
			if(i==0){
				System.out.println(array[i]);
				break;
			}System.out.print(array[i]+",");
		}
	}
	
}
