package loop;

public class While1_2 {
	public static void main(String[] args) {
		int num1=1;
		int num2=0;
		while (num1<=3){
			num2+=num1;
			num1+=1;
			System.out.println(num2);
		}
		System.out.println("num2 is "+ num2);
	}
}
