package TwoWeek.Inyoung.March14;

public class Chapter3_07_Casting {
    public static void main(String[] args) {
        /*
        형변환 : 연산 전에 변수 도는 상수(리터럴)의 타입을 다른 타입으로 변환하는 것
        (타입) 피연산자
         */

        double d = 85.4;
        int score = (int) d;
        System.out.println("score=" + score);
        System.out.println("d=" + d);

        /*
        자동 형변환 "기존의 값으 최대한 보존할 수 있는 타입으로 자동 형변환된다."
        byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)

        산술 변환 : 연산 직전에 발생하는 자동 형변환

        큰 자료형의 값을 작은 자료형의 변수에 저장하려면 반드시 명시적으로 형변환 연산자를 사용하여 변환해주어야 한다.
         */

        byte a = 10;
        byte b = 30;
        byte c = (byte)(a * b); // 데이터 손실 발생
        System.out.println(c);
    }
}
