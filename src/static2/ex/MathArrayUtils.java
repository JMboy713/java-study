package static2.ex;

public class MathArrayUtils {
	private MathArrayUtils(){
		// private 인스턴스 생성을 막는다.
	}
	public static int sum(int[] array){
		int result=0;
		for (int i : array) {
			result+=i;
		}
		return result;
	}
	public static double average(int[] array){
		return sum(array)/array.length;
	}

	public static int min(int[] array){
		int minimum=array[0];
		for (int i : array) {
			if (minimum>i){
				minimum=i;
			}
		}
		return minimum;
	}
	
	public static int max(int[] array){
		int maximum=array[0];
		for (int i : array) {
			if (maximum<i){
				maximum=i;
			}
		}
		return maximum;
	}

}
