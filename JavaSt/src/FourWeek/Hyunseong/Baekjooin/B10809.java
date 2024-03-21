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
            //(int)를 안써도 되는 이유?
            int index =(str.charAt(j) - 'a');
            if(arr[index] != -1)
                continue;
            arr[index] = j;
        }

        StringBuilder sb = new StringBuilder();
        for(int x : arr){
            sb.append(x + " ");
        }
        System.out.println(sb);


    }
}
