package array;

public class EnhancedFor1 {
	public static void main(String[] args) {
		int[] number={1,2,3,4,5};
		for(int i:number){
			System.out.println(i);
		}
		//iter 입력시 for-each 문. 
		for (int i : number) {
			System.out.println(i);
			
		}// for-each 문에서는 index를 사용할 수 없다. 인덱스를 사용하고자 할 때는 일반 for문을 사용하자.
	}
}
