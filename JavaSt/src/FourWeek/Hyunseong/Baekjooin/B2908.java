package FourWeek.Hyunseong.Baekjooin;

import java.io.*;
import java.util.*;

public class B2908 {


    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer tokenizer = new StringTokenizer(input);

        String Stringnumber1 = tokenizer.nextToken();
        String Stringnumber2 = tokenizer.nextToken();

        String intnumber1 = "";
        String intnumber2 = "";
        for(int i=Stringnumber1.length()-1; i>=0; i--){
            intnumber1 += Stringnumber1.charAt(i);
            intnumber2 += Stringnumber2.charAt(i);
        }
        int num1 = Integer.parseInt(intnumber1);
        int num2 = Integer.parseInt(intnumber2);

        int result = B2908.comPare(num1 , num2);
        System.out.println(result);

    }
    private static int comPare(int num1 , int num2){
        if(num1 < num2)
            return num2;
        return num1;
    }
}
