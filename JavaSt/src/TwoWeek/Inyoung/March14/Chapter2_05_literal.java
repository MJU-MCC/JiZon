package TwoWeek.Inyoung.March14;

public class Chapter2_05_literal {
    public static void main(String[] args) {
        // 상수를 선언하는 방법 : final 붙여주기
        final int MAX_VALUE; // 정수형 상수 선언
        MAX_VALUE = 100;     // 상수에 처음으로 값 저장
        /*
        MAX_VALUE = 200;     // 상수에 저장한 값 변경 불가
         */

        // 변수 : 하나의 값을 저장하기 위한 공간. 값을 변경할 수 있다
        // 상수 : 값을 한번만 저장할 수 있는 공간
        // 리터럴 : 상수의 다른 이름, 그 자체로 값을 의미하는 것
        final int MIN_VALUE = 50; //MIN_VALUE = 상수. 50 = 리터럴

        // 접미사를 꼭 붙여야 하는 자료형 : long, float 타입
        long big = 100_000_000_000L;
        float pi = 3.14f;
        double rate = 1.618d; // 생략가능

        // 문자열 리터럴. +를 사용하여 여러개의 문자열을 합칠수도
        String name = "Java";
        // 하지만 원래 String은 클래스이므로 객체를 생성해야함
        String name2 = new String("Java");
    }
}
