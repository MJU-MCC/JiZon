package ThreeWeek.HyunSeong.Baekjoon;

import java.io.*;
import java.util.*;

public class B10811_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int arr[] = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = i+1;
        }
        //참고 : https://build-enough.tistory.com/121
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken()) - 1;
            int right = Integer.parseInt(st.nextToken()) - 1;

            while(left < right){
                int box = arr[left];
                //후치연산을 통해 코드를 더 간략하게 나타낼 수 있다.
                arr[left++] = arr[right];
                arr[right--] = box;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int x : arr){
            sb.append(x+ " ");
        }
        System.out.println( sb);
    }
}
