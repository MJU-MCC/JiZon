package FifthWeek.HyunSeong2;

import java.io.*;
import java.util.*;

public class B2563 {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        boolean[][] papers = new boolean[100][100];

        for(int i=0; i<number; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            int finishleft = left+10;
            int finishright = right+10;

            for(int j=left-1; j<finishleft-1; j++){
                for(int k=right-1; k<finishright-1; k++){
                    papers[j][k] = true;
                }
            }

        }
        int count=0;
        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if(papers[i][j])
                    count++;
            }
        }
        System.out.println(count);
    }
}
