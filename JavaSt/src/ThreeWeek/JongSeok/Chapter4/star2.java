package ThreeWeek.JongSeok.Chapter4;

import java.util.Scanner;

public class star2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if ( 1 <= N && N <= 100) {
            for (int i = 1; i <= N; i++) { // 몇줄 나올지
                for (int blank = 0; blank < N - i ; blank++){ //*앞 빈칸
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2*i) -1; k++) { // *
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
