package TwoWeek.JooYeong;

import java.util.Scanner; //scanner클래스를 사용하기 위해 추가

public class input {
    public static void main(String[] args) {

        //14. 화면으로부터 입력받기

        Scanner scanner = new Scanner(System.in); //scanner클래스의 객체를 생성

        /* 
        String input = scanner.nextLine();
        int students = Integer.parseInt(input);
        입력을 이렇게도 받을 수 있으나 최적화를 위해 아래 코드처럼 작성함
        */

        System.out.print("학생 수: ");
        int students = Integer.parseInt(scanner.nextLine()); //입력받은 내용을 int타입 값으로 변환

        System.out.print("학생 당 간식 수: ");
        int snacks = Integer.parseInt(scanner.nextLine());

        //출력
        System.out.printf("준비해야 할 과자의 수: %d%n", students * snacks);
    }
}
