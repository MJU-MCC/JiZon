package ThreeWeek.Jooyeon;

import java.util.*;
public class Star_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int star;

        star = sc.nextInt();


        for(int z = 1; z < star+1 ; z++) {  // 가장 바깥 for문 0~5까지 5번 반복

            for (int i = z; i <star; i++) {

                System.out.print(" ");

            }

            for (int j = 0 ; j < 2*z-1 ; j++) {

                System.out.print("*");


            }

            System.out.println();


        }


    }
}
