package ThreeWeek.HyunSeong.Baekjoon;

import java.io.*;
import java.util.*;

public class MaxValue {
    static int arr[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[9];
        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        int max = Integer.MIN_VALUE;
        for(int j=0; j<9; j++){
            if(arr[j] >max){
                max = arr[j];
            }
        }
        for(int k=0; k<9; k++){
            if(arr[k] == max){
                sb.append(arr[k] + "\n" + (k+1));
            }
        }
        System.out.println(sb);
    }
}

