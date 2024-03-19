package ThreeWeek.HyunSeong.calc;

public class Calcu {
    public static void main(String args[]){

        int first=1;
        int second = ++first;
        first=1;
        int third = first++;

        System.out.println("second = " + second);
        System.out.println("third = " + third);

        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "hello";

        System.out.println("str1의 객체 주소값 = " + System.identityHashCode(str1));
        System.out.println("str2의 객체 주소값 = " + System.identityHashCode(str2));
        System.out.println("str3의 객체 주소값 = " + System.identityHashCode(str3));

        //그렇다면 이 두 줄의 출력값을 예상해보고 결과를 찍어보자
        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("(str1==str2) = " + (str1 == str2));

        //두개의 결과 값을 찾아보자
        int i = 0;
        int j = 10;
        i *= j+10;
        //처음 내 생각에는  i = i*j+10 이거라고 생각했었으나,
        // 위 코드를  풀어보면 아래와 같이 계산된다.
        // box = j + 10
        // i = i * box
        System.out.println("i = " + i);
        //그러나 아래 코드를 풀어본다면
        //i와 j가 먼저 곱하고 그 답에 10을 더한다.
        i = i*j+10;
        System.out.println("i = " + i);
    }
}
