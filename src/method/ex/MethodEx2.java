package method.ex;

import java.util.Scanner;

public class MethodEx2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	while(true){
		System.out.print("반복할 문자를 작성하세요. : ");
		String msg = scanner.nextLine();
		System.out.print("반복할 횟수 작성하세요. : ");
		int number=scanner.nextInt();
		scanner.nextLine();
		if(number==0){
			break;
		}else{
			message(number, msg);
		}
  }
}

  public static void message(int a, String msg) {
    for (int i = 0; i < a; i++) {
      System.out.println(msg);
    }
  }
}
