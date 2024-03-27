package TwoWeek.Jooyeon;
import java.util.*;
public class Switchcase_Calculation {
    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);

        System.out.println("두 수를 입력하세요: ");
        int num1 = Integer.parseInt(sc.nextLine()); //int형 num1에 정수를 입력받는다.
        int num2 = Integer.parseInt(sc.nextLine()); //int형 num2를 선언 후 해당 변수에 정수를 입력받는다.

        System.out.println("연산을 선택하세요: ");
        System.out.println("1: 두 수의 합");
        System.out.println("2: 두 수의 차");
        System.out.println("3: 두 수의 곱");
        System.out.println("4: 두 수의 나눗셈");

        int choice = Integer.parseInt(sc.nextLine()); //선택한 연산을 choice에 저장한다.

        switch(choice) { //switch문의 조건식 결과는 정수 또는 문자열이어야 한다.

            case 1: // case문의 값은 정수 상수만 가능하며, 중복되지 않아야 한다.
                System.out.println("두 수의 합: " + (num1 + num2));
                break; //break문을 통해 다음 case를 수행하지 않도록 해준다.
            case 2:
                System.out.println("두 수의 차: " + (num1 - num2));
                break;
            case 3:
                System.out.println("두 수의 곱: " + (num1 * num2));
                break;
            case 4:
                if(num2 != 0) {
                    System.out.println("두 수의 나눗셈(몫만 출력): " + (num1 / num2));
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;

            default: // 위의 case들에 해당하지 않는 choice를 했을 경우 default 수행
                System.out.println("잘못된 선택입니다."); 
                break;
        }
    }
}
