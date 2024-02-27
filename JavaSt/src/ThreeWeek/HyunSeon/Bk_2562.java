package ThreeWeek.HyunSeon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bk_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count[] = new int[10];
        int num = sc.nextInt();
        int c = 0;
        for (int i = 1; i < 9; i++) {
            count[i] = sc.nextInt();
            if (num < count[i]) {
                num = count[i];
            }
            if (num == count[i]) {
                c = i;
            }
        }
        System.out.println(num);
        System.out.println(c+1);
    }
}


