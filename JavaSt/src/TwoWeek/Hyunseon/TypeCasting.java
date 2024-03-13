package TwoWeek.Hyunseon;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        byte a =1;
        short b = 11;
        double c = sc.nextDouble();

        System.out.println(a+b); // 자동 형변환 int
        System.out.println((int)c); // 명시적 형변환

        int m = 1_000_000;
        int n = 2_000_000;
        long k = m*n;
        System.out.println(k);  // int * int => int 타입이 long이어도 이미 int 타입으로 계산됨
    }
}
