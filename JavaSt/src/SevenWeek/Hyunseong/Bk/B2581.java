package SevenWeek.Hyunseong.Bk;

import java.io.*;

public class B2581 {

    private void isPrime(int first , int second){

    }

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int M = Integer.parseInt(br.readLine());
//        int N = Integer.parseInt(br.readLine());


        boolean prime[] = new boolean[10_001];
        //true는 소수 , false는 소수가 아님

        prime[0] = false;
        prime[1] = false;

        int index = 2;

        for(int i=2; i<Math.sqrt(prime.length); i++){
            if( index/i == 0){
                prime[index] = true;
                System.out.println("prime[index] = " + prime[index]);
            }
            index++;
        }

        for(int i=0; i<prime.length; i++){
            if(prime[i])
                System.out.println(i+"는 소수이다.");
        }


    }
}
