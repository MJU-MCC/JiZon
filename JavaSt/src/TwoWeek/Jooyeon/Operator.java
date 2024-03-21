package TwoWeek.Jooyeon;

public class Operator {

    public static void main(String[] args) {

        byte a = 15;
        byte b = 30;

        byte c = (byte) (a+b);

        //byte c = a+b;   // a+b만 적으면 컴파일 에러가 발생한다. >> 명시적으로 형변환이 필요!


        //a+b의 연산결과는 byte형이 아닌 int형 (4byte)이다.
        //4byte의 값을 1byte의 변수에 형변환 없이 저장하려고 했기 때문에 에러가 발생

        System.out.println(c);

    }


}
