package array;

public class ArrayDi0 {
	public static void main(String[] args) {
		int[][] arr=new int[2][3];
		// arr[0][0]=1;
		// arr[0][1]=2;
		int count=1;
		for(int i =0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=count;
				count+=1;
			}
		}
		for(int i=0;i<=1;i++){
			System.out.println((i+1)+"row");
			System.out.println(arr[i][0]);
			System.out.println(arr[i][1]);
			System.out.println(arr[i][2]);
		}
		
	}
}
