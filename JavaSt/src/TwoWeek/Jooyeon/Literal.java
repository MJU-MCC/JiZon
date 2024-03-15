package TwoWeek.Jooyeon;

public class Literal {
    public static void main(String[] args) {

        // 리터럴이란 그 자체로 값을 의미하는 것
        // 리터럴은 기존에 알고있던 '상수'의 다른 이름

        int year = 2024; // year은 변수, 2024는 리터럴

        // 상수의 이름은 모두 대문자로 하는 것이 암묵적인 관례
        // 상수 선언 시엔 변수의 타입 앞에 final을 붙여준다.

        /* final을 붙여주는 이유

        1. 불변성 - 변수에 할당된 값을 변경할 수 없다.
        2. 코드 가독성과 유지 보수성 - 코드의 의도가 명확해진다.
        3. 컴파일 타임 상수 - 해당 변수를 선언 시 초기화해야 하며 한 번 초기화된 후 다시 할당할 수 없음을 의미*/

        final int MAX_VALUE = 12345; // MAX_VALUE는 상수, 100은 리터럴

        System.out.println("----------------------------------------------------");
        System.out.println("리터럴");
        System.out.println();
        System.out.println("year:"+ year);
        System.out.println("MAX_VALUE:"+ MAX_VALUE);
        System.out.println("----------------------------------------------------");
    }
}
