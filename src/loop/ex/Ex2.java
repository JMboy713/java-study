package loop.ex;

public class Ex2 {
	public static void main(String[] args) {
		// int count=0;
		// for(int i=2;count<10;i++){
		// 	if (i%2==0){
		// 		System.out.println(i);
		// 		count+=1;
		// 	}
		// }
		int count=0;
		int num=2;
		while (count<10){
			if (num%2==0){
				System.out.println(num);
				num+=2;
				count+=1;
			}
		}
	}
}
