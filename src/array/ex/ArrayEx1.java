package array.ex;

import javax.swing.plaf.ToolBarUI;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] student={90,80,70,60,50};
		int total=0;
		for (int i : student) {
			total+=i;
		}
		double avg=(double) total/5;
		System.out.println("total : "+ total);
		System.out.println("avg is "+avg);
	}
}
