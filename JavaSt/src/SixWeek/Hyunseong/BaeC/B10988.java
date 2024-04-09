package SixWeek.Hyunseong.BaeC;

import java.io.*;

public class B10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*
1차시도
문제점 : 짝수개 입력 kkkkkk일 경우 sb는 kkk가 출력  , sb1은 kk가 출력 되어 펠린드롬인데도 불구하고 0이 나와버린다.
        int center = input.length()/2;

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        for(int i=0; i<center; i++){
            sb.append(input.charAt(i));
            System.out.println("i = " + i);
        }
        for(int j=input.length()-1; j>center; j--){
            sb1.append(input.charAt(j));
            System.out.println("j = " + j);
        }

        System.out.println("sb = " + sb);
        System.out.println("sb1 = " + sb1);

        if(sb.toString().equals(sb1.toString()))
            System.out.println(1);
        else{
        System.out.println(0);
        }
*/
        String input = br.readLine();
        int length = input.length();

        int start = 0;
        int finish = length - 1;

        int result = 0;
        for(int i=0; i<length; i++){

            if(start > finish){
                break;
            }
            char ch1 = input.charAt(start);
            char ch2 = input.charAt(finish);

            if(ch1 == ch2) {
                result = 1;
            }else{
            result = 0;
            break;
            }
            start++;
            finish--;
        }
        System.out.println(result);
    }
}
