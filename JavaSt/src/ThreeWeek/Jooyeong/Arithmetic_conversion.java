package ThreeWeek.Jooyeong;

public class Arithmetic_conversion {
    
    public static void main(String[] args) {
        //10. 산술 변환


        //byte 타입은 -128부터 127까지의 값을 가진다.
        //자바의 기본 연산은 int 타입으로 계산되는데 (a*b)결과는 int 타입으로 계산되고 
        //byte로 casting해 c에 저장

        //byte타빙은 256의 주기로 순환을 하기 때문에 300을 256으로 나눈 나머지인 
        //44가 c에 저장되어 출력됨
        byte a = 10;
        byte b = 30;
        byte c = (byte)(a * b);
        System.out.println(c);
    }
}
