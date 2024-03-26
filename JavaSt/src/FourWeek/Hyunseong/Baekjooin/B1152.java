package FourWeek.Hyunseong.Baekjooin;

import java.io.*;
import java.util.*;

public class B1152 {
    public static void main(String[] args) throws IOException{

//        1차시도
//        공백을 입력하였는데 1이 출력되었다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strArr = str.split(" ");
        System.out.println(strArr.length);

        /*
        2차시도
        예제 입력 1을 입력하였는데 입력이 끝나지 않았다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer token = new StringTokenizer(str);
        int number =0;
        while (token.hasMoreTokens())
            number++;
        System.out.println(number);
         */
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        StringTokenizer tokenizer = new StringTokenizer(str);
//        System.out.println(tokenizer.countTokens());

    }
}
