package FourWeek.Hyunseong.Baekjooin;

import java.io.*;

public class B24444 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        for(int i=0; i<number; i++){
            for(int j=number-1; j>i; j--){
                System.out.print(" ");
            }
            for(int k=0; k<(2*i)+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<number-1; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }for(int k=2*number-3; k>2*i; k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
