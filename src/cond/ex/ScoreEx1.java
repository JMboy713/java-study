package cond.ex;

public class ScoreEx1 {
    public static void main(String[] args) {
        int score;
        score=95;
        if (score>=90){
            System.out.println("출력: 학점은 A입니다");
        }else if (score>=80){
            System.out.println("출력: 학점은 B입니다");
        }else if (score>=70) {
            System.out.println("출력 학점은C입니다");

        }else if (score>=60) {
            System.out.println("출력 학점은 D 입니다");
        }else{
            System.out.println("출려겨 학점은 e입니다.");
        }
    }
}
