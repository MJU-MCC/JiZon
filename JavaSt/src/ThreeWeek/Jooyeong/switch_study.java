package ThreeWeek.Jooyeong;
import java.util.Scanner;

public class switch_study {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("현재 월을 입력하세요: ");
        int month = scan.nextInt();

        switch (month) {
            case 3: case 4: case 5:
                System.out.println("현재의 계절은 봄입니다");
                break;

            case 6: case 7: case 8:
                System.out.println("현재의 계절은 여름입니다");
                break;    

            case 9: case 10: case 11:
                System.out.println("현재의 계절은 가을입니다");
                break;    
            
            //나머지 12,1,2월
            default:
                System.out.println("현재의 계절은 겨울입니다");
        }


        //if문으로 ||를 이용해 가능

    }
}
