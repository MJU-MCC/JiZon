package ThreeWeek.JongSeok.Chapter4;

import java.util.Scanner;

public class blank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++){
            for (int k = 1; k < N - i; k++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
