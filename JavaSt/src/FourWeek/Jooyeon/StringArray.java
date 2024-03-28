package FourWeek.Jooyeon;

import java.util.*;

public class StringArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] fruits = new String[3]; //3개의 문자열 담을 수 있는 배열 생성,


        // fruits 배열의 index는 0 ~ 2까지.

        // String 배열 생성 시 각 요소의 값이 null로 초기화된다.

        //  String 배열 초기화

        for (int k = 0; k < fruits.length; k++) { // fruits 배열의 길이만큼 과일을 입력받는다.
            System.out.print("과일을 입력하세요: ");
            fruits[k] = sc.nextLine();
        }

//        fruits[0] = "apple";
//        fruits[1] = "grape";
//        fruits[2] = "mango";

        /*
        
        중괄호를 이용한 배열 초기화

       String[] fruits = {"apple", "grape", "mango"};
         */


        System.out.println("fruits 배열의 길이: " + fruits.length); //length() 메소드는 배열의 길이를 반환해준다.

        for (int i = 0; i < fruits.length; i++) { // fruits 배열 길이-1 까지 출력
            System.out.printf("fruits[%d]: %s%n", i, fruits[i]);
        }

    }
}
