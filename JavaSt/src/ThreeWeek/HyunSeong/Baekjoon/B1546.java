package ThreeWeek.HyunSeong.Baekjoon;

import java.io.*;
import java.util.*;

public class B1546 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int max = arr[N-1];
        //각 점수를 최고점수로 나눈뒤 저장 할 점수 배열
        double brr[] = new double[N];
//        for(int i=0; i<N; i++){
//            brr[i] = (arr[i]/max);
//            System.out.println("brr배열의 [" + i + "] 는 입니다 = " + brr[i]);
//        }
        /*
         * 위 식이랑 다른점은 분자를 int냐 double이냐 차이인데 분자가 int일 경우는 몫만 계산이 되고 나머지는 버려진다.
         * 그러나 아래와 같이 분자가 double일 경우는 나머지까지 계산되어서 소수점이 나온다.
         */

        double sum =0;
        for(int i=0; i<N; i++){
            brr[i] = ((double) arr[i] /max)*100;
            sum += brr[i];
//            System.out.println("brr배열의 [" + i + "] 는 입니다 = " + brr[i]);
        }
        System.out.println(sum / N);

    }
}
