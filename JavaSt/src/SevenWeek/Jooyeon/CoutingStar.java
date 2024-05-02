package SevenWeek.Jooyeon;

import java.util.Scanner;

public class CoutingStar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력: ");
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



