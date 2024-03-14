package TwoWeek.Inyoung.March14;

import java.util.Scanner;

public class Chapter3_15_Operator3 {
    public static void main(String[] args) {

        /*
        논리 연산자
        || (OR결합) 피연산자 중 어느 한 쪽이 true면 true
        && (AND결합) 피연산자 양쪽 모두 true여야 true

        1. x는 10보다 크고, 20보다 작다.
        x > 10 && x < 20

        2. i는 2의 배수 또는 3의 배수이다.
        i%2 == 0 || i%3 == 0

        3. i는 2의 배수 또는 3의 배수지만 6의 배수는 아니다.
        (i%2 == 0 || i%3 == 0) && i%6 != 0

        4. 문자 ch는 숫자('0' ~ '9')이다.
        5. 문자 ch는 대문자 또는 소문자이다.
         */

        Scanner scanner = new Scanner(System.in);
        char ch = ' ';

        System.out.printf("문자를 하나 입력하세요.>");

        String input = scanner.nextLine();
        ch = input.charAt(0);

        if ('0' <= ch && ch <= '9') {
            System.out.printf("입력하신 문자는 숫자입니다.%n");
        }

        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.printf("입력하신 문자는 영문자입니다.%n");
        }

        /*
        논리 부정 연산자 !
        : true와 false를 반대로 바꾸는 것

        조건 연산자 [조건식 ? 식1 : 식2]
        result = (x > y) ? x : y;

        대입 연산자 =
        : 연산 진행방향이 오른쪽에서 왼쪽 x = y = 3
        lvalue = rvalue
        lvalue는 반드시 변수처럼 값을 변경할 수 있는 것이어야 한다.

        int i = 0;
        3 = i + 3;  //에러. lvalue가 값을 저장할 수 있는 공간이 아니다.
        i + 3 = i;  //에러. lvalue의 연산결과가 리터럴이라 불가

        final int MAX = 3;  // 변수 앞에 키워드 final을 붙이면 상수가 된다.
        MAX = 10;           // 에러. 상수(MAX)에 새로운 값을 저장할 수 없다.

        복합 대입 연산자
        i *= 10 + j;
        i = i * (10+j);
         */
    }
}
