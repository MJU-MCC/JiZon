package FourWeek.Inyoung.Baekjoon;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2563

public class num2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[100][100];
        int confetti = sc.nextInt();
        int num = 0;

        for(int i=0; i<confetti; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            for(int j=n; j<n+10; j++) {
                for(int k=m; k<m+10; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        for(int i=0; i<100; i++) {
            for(int j=0; j<100; j++) {
                if(arr[i][j] == 1) {
                    num += 1;
                }
            }
        }
        sc.close();
        System.out.println(num);
    }
}

// ??? BufferedReader를 사용하는 방법도 있던데 이해안댐..
