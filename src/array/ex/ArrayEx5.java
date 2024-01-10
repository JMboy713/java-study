package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("몇명의 학생이 있나요? : ");
    String[] subject=new String[]{"국어","영어","수학"};
    int student = input.nextInt();
    int[][] score = new int[student][subject.length];
    
    for(int i=0;i<student;i++){
      System.out.println((i+1)+"번 학생의 성적을 입력하세요: ");
      for (int j=0;j<subject.length;j++) {
        System.out.print(subject[j]+"점수 : ");
        score[i][j]=input.nextInt();
      }
    }
    for(int i=0;i<score.length;i++){
      int total=0;
      for(int j=0;j<score[i].length;j++){
        total+=score[i][j];
      }
      System.out.println((i+1)+"번 학생의 총점 : "+total+", 평균 : "+((double) total/score[i].length));
      
    }


    }
  }

