package ThreeWeek.Jooyeong;
import java.util.Scanner;


public class if_study {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //scan객체 생성


        //if문
        int score = 30;

        if(score > 60)
        {
            System.out.println("합격입니다");
        }

        //한 줄로 작성하게 된다면 (esle도 가능)
        //if(score > 60)  System.out.println("합격입니다");

        //else-if
        // System.out.println("점수 입력: ");
        // int score2 = scan.nextInt();

        // if(score2 > 90){
        //     System.out.println("A");
        // }
        // else if (score2 > 70) {
        //     System.out.println(" B");
        // }
        // else if (score2 > 50) {
        //     System.out.println("C");            
        // }
        // else if (score2 > 30) {
        //     System.out.println("D");
        // }
        // else{
        //     System.out.println("F");
        // }



        //중첩if문
        int score3 = 0;
        char grade = ' ', opt = ' ';

        System.out.print("점수를 입력해주세요: ");
        score3 = scan.nextInt();

        System.out.printf("당신의 점수는 %d점 입니다\n", score3);

        if (score3 >= 90) {
            grade = 'A';
            if (score3 >= 98) {
                opt = '+';
            }
            else if (score3 < 94) {
                opt = '-';
            }
        }   else if (score3 >= 80) {
            grade = 'B';
            if (score3 >= 88) {
                opt = '+';
            } else if (score3 < 84) {
                opt = '-';
            }
        }   else {
            grade = 'C';
        }
        System.out.printf("당신의 학점은 %c%c입니다.\n", grade, opt);

    }
}
