package ThreeWeek.HyunSeong.variabl;

public class ThisPractice {
    public static void main(String[] args) {
        int a = 10; //우리가 아는 10진수 -> 10
        int b = 010; //앞에 0을 붙이면 8진수 -> 8
        int c = 0x10; //앞에 0x를 붙이면 16진수  -> 16
        int d = 0b10; //앞에 0b를 붙이면 2진수  -> 2

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        double e = 0.1; //우리가 아는 0.1 숫자 그대로
        double f = 2E-1; //영어 E는 10의 제곱을 뜯한다
        float g = 0.1f;

        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

    }
}
