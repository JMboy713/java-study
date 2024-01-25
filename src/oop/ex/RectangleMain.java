package oop.ex;

import java.util.Scanner;

public class RectangleMain {
	public static void main(String[] args) {
		Rectangle rec= new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.print("가로 길이를 입력하세요 : ");
		rec.width=scanner.nextInt();
		scanner.nextLine();
		System.out.print("세로길이를 입력하세요 : ");		
		rec.height=scanner.nextInt();
		scanner.nextLine();

		rec.calculateArea();
		rec.calculatePerimeter();
		rec.isSquare();
	}
	
}
