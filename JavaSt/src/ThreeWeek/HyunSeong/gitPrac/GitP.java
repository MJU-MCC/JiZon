package ThreeWeek.HyunSeong.gitPrac;

public class GitP {
    public static void main(String[] args) {
//        System.out.println("Git");
//        System.out.println("Git1");
//        System.out.println("Git2");
//        System.out.println("Git3");
//        System.out.println("Git4");
//        System.out.println("Git6");

//        char ch = 'A'; // 문자 'A'를 선언
//        int unicodeValue = ch; // 문자형을 정수로 변환하여 유니코드 값 저장
//        System.out.println("유니코드 값: " + ch); // 결과 출력
//        System.out.println("유니코드 값: " + unicodeValue); // 결과 출력
//        byte a = 10;
//        int b = a;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        char ch = 'A'; // 문자 'A'를 선언
        int unicodeValue = (int) ch; // 문자형을 정수로 변환하여 유니코드 값 저장
        System.out.println("유니코드 값: " + ch); // 결과 출력
        System.out.println("유니코드 값: " + unicodeValue); // 결과 출력

        System.out.println("==================");
// 괄호를 하지 않아도 결과 값은 똑같습니다.

//        char ch = 'A'; // 문자 'A'를 선언
//        int unicodeValue = ch; // 문자형을 정수로 변환하여 유니코드 값 저장
//        System.out.println("유니코드 값: " + ch); // 결과 출력
//        System.out.println("유니코드 값: " + unicodeValue); // 결과 출력
        short shortValue = 1000; // short 타입 변수 선언 및 값 할당
        // short 값을 byte 타입으로 변환하여 변수에 저장
        byte byteValue = (byte) shortValue;
        System.out.println("shortValue = " + shortValue);
        System.out.println("변환된 값: " + byteValue); // 결과 출력

    }
}
