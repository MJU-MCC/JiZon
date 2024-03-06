package FourWeek.Hyunseong.Baekjooin;

import java.io.*;

public class B11720 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int sum =0;

        for(int i=0; i<num;i++){
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        System.out.println(sum);
    }
}
