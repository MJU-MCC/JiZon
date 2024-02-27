package ThreeWeek.HyunSeong.Baekjoon;

import java.io.*;
import java.util.*;

public class B10810 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int arr[] = new int[N+1];

        for(int a=0; a<M; a++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for(int x = i ; x<=j; x++){
                arr[x] = k;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int a=1; a<arr.length; a++){
            sb.append(arr[a] + " ");
        }
        System.out.println(sb);
    }
}
