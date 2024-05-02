package SevenWeek.Inyoung;

import java.util.Scanner;

public class BaekJoon_2581_math {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(); int N = sc.nextInt();

        int sum = 0, min = 100;

        for(int i = M; i <= N; i++){
            for(int j = M; j <= N; j++){
                if(i % j == 0) {
                    break;
                }
            }
            sum += i;
            if(i<min){
                min = i;
            }
        }

        //소수 판별부 코드에 문제

        System.out.printf("%d \n", sum);
        System.out.printf("%d", min);
    }
}
