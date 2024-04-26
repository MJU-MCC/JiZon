package SevenWeek.Hyunseong.Bk;

import java.io.*;
import java.util.*;

public class B2439 {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int i=num; i>0; i--){

            for(int j=i; j>1; j--)
                System.out.print(" ");
            for(int k=num; k>=i; k--)
                System.out.print("*");
            System.out.println();

        }
    }
}
