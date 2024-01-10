package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("입력받을 숫자의 개수를 입력하세요: ");
    int number = scanner.nextInt();
    System.out.println(number + "개의 정수를 입력하세요. : ");
    int[] array;
    array = new int[number];
    int maximum = 0;
    int minimum = 0;

    for (int i = 0; i < number; i++) {
      if (i == 0) {
        array[i] = scanner.nextInt();
        maximum = array[i];
        minimum = array[i];
      } else {
        array[i] = scanner.nextInt();
        if (array[i] > maximum) {
          maximum = array[i];
        }
        if (array[i] < minimum) {
          minimum = array[i];
        }
      }
    }
    System.out.println("가장 작은 정수 : " + minimum);
    System.out.println("가장 큰 정수 : " + maximum);
  }
}
