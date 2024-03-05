package ThreeWeek.HyunSeong.Baekjoon;

import java.io.*;
public class B9086 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<number; i++){
            String str = br.readLine();
            sb.append(str.charAt(0));
            sb.append(str.charAt(str.length()-1)+"\n");
        }
        System.out.println(sb);
    }
}
