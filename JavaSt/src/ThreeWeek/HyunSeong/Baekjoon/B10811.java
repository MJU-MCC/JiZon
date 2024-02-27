package ThreeWeek.HyunSeong.Baekjoon;

import java.io.*;
import java.util.*;

public class B10811 {
//    public static void printArray(int[] arr , int[] brr){
//        System.out.println();
//
//        for(int a=0; a<arr.length; a++){
//            System.out.print("arr ["+a+"]의 값은 "+arr[a]+"\t");
//        }
//        System.out.println();
//        for(int a=0; a<brr.length; a++){
//            System.out.print("brr ["+a+"]의 값은 "+brr[a]+"\t");
//        }
//    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //이번 입력은 5 4 형식으로 띄어쓰기를 하기에 토큰나이저를 이용하여 토큰 별로 잘랐다.
        StringTokenizer st = new StringTokenizer(br.readLine());
        //한줄을 토큰으로 만들어서 한개씩 토큰으로 꺼내는데 타입이 String이기에 int타입으로 형변환하기 위하여 사용
        //참고로 Integer.valueOf()메서드는 Integer 클래스를 반환한다.
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //N개의 바구니를 만들기 위해서
        int arr[] = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = i+1;
        }

        for(int i=0; i<M; i++){
            int box = 0;
            st = new StringTokenizer(br.readLine());
            int frontindex = Integer.parseInt(st.nextToken());
            int backindex = Integer.parseInt(st.nextToken());

            //임의의 배열을 만들어 역순으로 값을 저장
            //뒤에 플러스 1을 한 이유는 앞 인덱스에 해당하는 배열 1칸도 포함해야하기 때문에
            int brr[] = new int[backindex - frontindex + 1];

            int k = 0;
            for(int j=backindex-1; j>=frontindex-1; j--){
                brr[k] = arr[j];
                k++;
            }

            k=frontindex -1;
            for(int j=0; j<brr.length; j++){
                arr[k] = brr[j];
                k++;
            }

        }

        StringBuilder sb = new StringBuilder();
        for(int x : arr){
            sb.append(x+" ");
        }
        System.out.println(sb);
    }

}
