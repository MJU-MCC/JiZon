package ThreeWeek.HyunSeon;

import java.util.Scanner;

public class BK_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bas = sc.nextInt();
        int num = sc.nextInt();
        int number[] = new int[bas];

        for (int i = 0; i < num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for (int j = a; j <= b; j++) {
                number[j - 1] = c;
            }
        }
        for (int i = 0; i < bas; i++) {
            System.out.println(number[i]);
        }
    }
}
