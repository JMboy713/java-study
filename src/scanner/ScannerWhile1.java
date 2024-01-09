package scanner;
import java.util.Scanner;
public class ScannerWhile1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.print("문자를 입력해 주세요 (exit 시 종료): " );
			String str = scanner.nextLine();
			if (str.equals("exit")){
				break;
			}

		}
	}
}
