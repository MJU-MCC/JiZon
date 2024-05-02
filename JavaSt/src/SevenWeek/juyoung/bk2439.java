package SevenWeek.juyoung;

import java.util.Scanner;

public class bk2439 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        for (int i=0; i < star; i++ ){
            for (int k = star - 1; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}