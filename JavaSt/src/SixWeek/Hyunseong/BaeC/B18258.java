package SixWeek.Hyunseong.BaeC;

import java.io.*;
import java.util.*;
public class B18258 {
    public static void main(String[] args) throws IOException {
        /*
        https://www.acmicpc.net/problem/18258
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();

        for(int i=0; i<number; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            Integer intData = Integer.parseInt(st.nextToken());
        }

    }
}
