package SevenWeek.Inyoung;

import java.util.Scanner;

public class BaekJoon_2439_star {
    public static void main(String[] args) {
        int N, i, j, k;

        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        for (i = 1; i <= N; i++){

            for(j = 1; j <= N-i; j++) {
                System.out.printf(" ");
            }

            for(k = 1; k <= i; k++){
                System.out.printf("*");
            }

            System.out.println();
        }
    }
}
