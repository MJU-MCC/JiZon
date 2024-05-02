package SevenWeek.hyunseon;

import java.util.Scanner;

public class bj10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] ch = new char[5][15];

        for(int i=0;i<5;i++){
            String str1 = sc.next();
            for(int j=0;j<str1.length();j++){
                ch[i][j] = str1.charAt(j);
            }
            for(int j=str1.length();j<15;j++){
                ch[i][j]=' ';
            }
        }
        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(ch[j][i]!=' '){
                    System.out.print(ch[j][i]);
                }
            }
        }
    }
}
