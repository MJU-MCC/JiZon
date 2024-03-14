package TwoWeek.Inyoung.March14;

public class Chapter2_15_Overflow {
    public static void main(String[] args) {
        /*
        오버플로우 : 해당 타입이 표현할 수 있는 값의 범위를 넘어서는 것.
        최대값 + 1 -> 최소값
        최소값 - 1 -> 최대값

        부호없는 정수는 2진수로 0000이 될 때 오버플로우가 발생하고
        부호있는 정수는 부호비트가 0에서 1이 될 때 오버플로우가 발생한다.

        부호없는 정수(4bit) 표현범위 : 0 ~ 15
        부호있는 정수(4bit) 표현범위 : -8 ~ -7
         */

        short sMin = -32768, sMax = 32767;
        char cMin = 0, cMax = 65535;

        System.out.println("sMin = " + sMin);
        System.out.println("sMin - 1 = " + (short)(sMin-1));
        // 최소값 - 1 -> 최대값
        System.out.println("sMax = " + sMax);
        System.out.println("sMax + 1 = " + (short)(sMax+1));
        // 최대값 + 1 -> 최소값
        System.out.println("cMin = "+ (int)cMin);
        System.out.println("cMin-1 = "+ (int)--cMin);
        // 최소값 - 1 -> 최대값
        System.out.println("cMax = "+ (int)cMax);
        System.out.println("cMax+1 = "+ (int)++cMax);
        // 최대값 + 1 -> 최소값
    }
}
