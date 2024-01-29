package access.ex;

public class MaxCounter {
	private int count=0;

	private int max;

	public MaxCounter(int max){
		this.max=max;
	}
	public void increment(){
		if ((count+1)>max){
			System.out.println("최대값 이상으로 못 키웁니다.");
		}	else{
			count++;
			System.out.println("count값은 "+count+"입니다.");
		}
	}
	public int getCount(){
		return count;
	}

	
}
