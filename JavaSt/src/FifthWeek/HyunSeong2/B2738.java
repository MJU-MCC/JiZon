package FifthWeek.HyunSeong2;

import java.io.*;
import java.util.*;

public class B2738 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        for(int i=0; i<N; i++){
            token = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                int element = Integer.parseInt(token.nextToken());
                A[i][j] = element;
            }
        }
        for(int i=0; i<N; i++){
            token = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                int element = Integer.parseInt(token.nextToken());
                B[i][j]  = element;
            }
        }
//        //2차원 배열 출력해보기
//
//        for(int i=0 ; i<N; i++){
//            for(int j=0 ;j<M; j++){
//                System.out.print(A[i][j] +"   ");
//            }
//            System.out.println();
//        }
//        System.out.println("=================================================");
//        for(int i=0; i<N; i++){
//            for(int j=0; j<M; j++){
//                System.out.print(B[i][j]+"    ");
//            }
//            System.out.println();
//        }
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                A[i][j]=A[i][j]+B[i][j];
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
