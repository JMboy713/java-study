package oop.ex;

public class Rectangle {
	int width;
	int height;

	int calculateArea(){
		System.out.println("넓이는 "+(width*height));
		return (width*height);
	}
	int calculatePerimeter(){
		System.out.println("둘레는 "+(width*2+height*2));
		return (
			width*2+height*2
		);
	}
	void isSquare(){
		if (width==height) {
			System.out.println("정사각형 입니다.");
		}else{
			System.out.println("정사각형이 아닙니다.");
		}
	}
}
