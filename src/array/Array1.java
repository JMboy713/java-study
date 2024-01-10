package array;

public class Array1 {
	public static void main(String[] args) {
		int[] students; // 정수형 배열을 담을수 있는 변수를 만든다.
		students=new int[5]; // 5개 들어갈 수 있는 배열을 student 에 담는다.
		students[0]=90;
		students[1]=80;
		students[2]=70;
		students[3]=60;
		students[4]=50;
		for (int i =0;i<students.length;i++){
			System.out.println(students[i]) ;
		}

	}
	
}
