package ThreeWeek.HyunSeong.Baekjoon;

import java.io.*;

public class B27866 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int number = Integer.parseInt(br.readLine());
        //String은 char배열이라서 인덱스가 0부터 시작
        System.out.println(str.charAt(number-1));
    }
}
