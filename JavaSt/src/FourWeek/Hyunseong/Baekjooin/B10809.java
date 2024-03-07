package FourWeek.Hyunseong.Baekjooin;

import java.io.*;

public class B10809 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int[] arr = new int[26];

        for(int i=0; i<arr.length; i++){
            arr[i] = -1;
        }
        for(int j=0; j<str.length(); j++){
            int num = (str.charAt(j) - 'a');
            System.out.println("num = " + num);
        }


    }
}
