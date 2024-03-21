package ThreeWeek.HyunSeon;

import java.util.Scanner;

public class BJ_2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i=0; i< count; i++){
            for(int j=0; j<count-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
