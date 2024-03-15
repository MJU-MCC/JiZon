package TwoWeek.Jooyeon;
import java.util.*;
public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // scan 객체 생성
        System.out.println("----------------------------------------------------");
        System.out.println("조건 연산자, 복합대입연산자");
        System.out.println();


        /*
        조건식 ? 식 1 : 식2
        조건 연산자는 첫 번째 피연산자인 조건식의 평가결과에 따라 다른 결과 반환
        조건식의 평가결과가 true이면 식1이, false이면 식2가 연산결과가 된다.
        */

        int result; // int형 변수 result 선언
        System.out.println("정수 x를 입력하시오: ");
        int x = scan.nextInt(); // 정수를 하나 입력받아 x에 저장
        System.out.println("정수 y를 입력하시오: ");
        int y = scan.nextInt(); // 정수를 하나 입력받아 y에 저장
        result = (x>y) ? x:y; //삼항 연산자를 통하여 x>y가 true이며 x가 result에, false이면 y가 result에 저장

        System.out.println("x,y 중 큰 값: "+result); //result 출력


        //대입 연산자 - 변수와 같은 저장공간에 값 또는 수식의 연산결과 저장하는 데 사용
        int q,w;
        q = w= 3; // 연산이 오른쪽에서 왼쪽으로 진행된다.

        /*

        대입 연산자의 왼쪽 피연산자는 lvalue (left value)
        오른쪽 피연산자는 rvalue(right value)라고 한다.
        q = 3 ( q는 lvalue, 3은 rvalue)

        rvalue는 변수뿐만 아니라 식이나 상수 모두 가능하지만 lvalue는 반드시 변수처럼 값을 변경할 수 있는 것이어야 한다.
        따라서 리터럴이나 상수같이 값을 저장할 수 없는 것들은 lvalue가 될 수 없다.

         */
        System.out.println("----------------------------------------------------");
        System.out.printf("q값: "+ q); //q값 출력
        System.out.println(); //개행

        //복합 대입연산자

        /*
            대입 연산자는 다른 연산자(op)와 결합하여 ‘op=’ 같은 방식으로 사용가능

            ex) i = i+3 은 i += 3과 같다.

         */

        q+=3; // q = q+3;과 같음
        System.out.println("복합 대입연산을 한 후 q값:" + q);

        System.out.println("----------------------------------------------------");

    }
}
