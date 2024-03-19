package ThreeWeek.HyunSeon;

import java.io.*;
import java.util.*;

public class B2675 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i<number ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int repeat = Integer.parseInt(st.nextToken()); //각 문자 마다 반복 될 횟수
            String str = st.nextToken();                    //반복 될 문자
            int finish = str.length();                      //문자 개수

            for(int j=0; j<finish; j++){
                for(int k=0; k<repeat; k++)
                    sb.append(str.charAt(j));
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
