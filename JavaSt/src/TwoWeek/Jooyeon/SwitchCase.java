package TwoWeek.Jooyeon;
import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        int result;
        int num=5;
        final int ONE = 1; //final 키워드는 상수를 선언하는 데 사용
        //한 번 초기화가 이루어지면 그 값을 변경할 수 없다.

        Scanner sc = new Scanner(System.in);

        /*

        <switch 문>

        switch(조건식) {
                case 값1 :
                    // 조건식의 결과가 값1과 같을 경우 수행될 문장들
                    // ...
                    break;
                case 값2 :
                       // 조건식의 결과가 값2와 같을 경우 수행될 문장들
                       // ...
                     break; //switch문을 벗어난다.
                  // ....
                  default :
                  // 조건식의 결과와 일치하는 case문이 없을 때 수행될 문장들
                  // ..
                  }


           switch문의 제약조건

           1. switch문의 조건식 결과는 정수 또는 문자열이어야 한다.
           2. case문의 값은 정수 상수만 가능하며, 중복되지 않아야 한다.

         */


        System.out.println("수를 입력하세요: ");
        result = Integer.parseInt(sc.nextLine()); // result에 입력된 문자를 정수로 형변환하여 저장한다

        switch(result) { //result는 int로 형변환 되었기에 정수형

            case 2:  //case에 1을 적으면 중복돼서 오류가 컴파일된다.
                System.out.println("result 값은 2");
                break;
            case ONE :
                System.out.println("정수 상수 ONE: "+ONE);
                break;
        //    case '1': // 사용 가능하다. 문자 리터럴이기에 정수 상수 49와 동일 // 하지만 여기서 result는 int형이기에 이 코드에서는 에러.
        //        System.out.println();
        //      break;
            default:
                System.out.println("default: " +result);
          //  case "YES" : // jdk1.7부터 허용 문자열 리터럴
                           // 이 경우는 result가 String형 변수인 경우 사용 가능

            //case num:
            //    System.out.println("num");// 에러. 변수는 불가

            //case 1.0 : // 에러. 실수도 불가

        }




    }
}
