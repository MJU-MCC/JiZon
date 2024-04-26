package SevenWeek.Jooyeon;

import java.util.Scanner;

public class CoutingStar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            for (int k = i + 1; k < a; k++) {
                System.out.print(" ");
            }
            for (int j = a - 1 - i; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



