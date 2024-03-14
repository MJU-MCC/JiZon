package TwoWeek.Jooyeon;

public class OverflowExample {
    public static void main(String[] args) {

        /*
            정수형의 오버플로우는 컴퓨터에서 사용되는 정수형 데이터 타입의 범위를 넘어서는 경우를 가리킨다.
            예를 들어, 8비트 부호 없는 정수(unsigned char)의 경우 0에서 255까지의 값을 표현할 수 있다.
            만약 255에 1을 더하면, 값은 256이 되는데, 이는 8비트에서 표현할 수 있는 최대 값인 255를 넘어선다.
             이 경우 오버플로우가 발생하여 값이 0으로 wrap-around될 수 있다.

             **"Wrap-around"은 값이 특정 범위를 벗어나면 해당 범위의 반대쪽 끝으로 돌아가는 것을 의미.
             오버플로우가 발생했을 때 값이 최대값에서 최소값으로, 또는 최소값에서 최대값으로 돌아가는 것을 말한다.

            부호있는 정수의 경우에도 마찬가지로 오버플로우가 발생할 수 있다.
            예를 들어, 8비트 부호 있는 정수(signed char)의 경우 -128부터 127까지의 값을 표현할 수 있다.
            만약 127에 1을 더하면, 값은 -128이 되는데, 이는 최대값 127을 넘어선다.
            이 경우에도 오버플로우가 발생하여 값이 최소값인 -128로 wrap-around될 수 있다.


         */
        // 정수형의 오버플로우 예시
        byte num1 = 127; // 8비트 부호 있는 정수의 최대값
        System.out.println("Before overflow: " + num1);
        num1++; // 오버플로우 발생
        System.out.println("After overflow: " + num1); // 값이 -128로 wrap-around됨

        // 부호없는 정수형의 오버플로우 예시
        int num2 = 2147483647; // 32비트 부호 있는 정수의 최대값
        System.out.println("Before overflow: " + num2);
        num2++; // 오버플로우 발생
        System.out.println("After overflow: " + num2); // 값이 -2147483648로 wrap-around됨
    }
}
