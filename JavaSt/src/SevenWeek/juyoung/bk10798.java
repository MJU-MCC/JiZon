package SevenWeek.juyoung;

import java.util.Scanner;

public class bk10798 {
    public static void main(String[] args) {
        char [][] message = new char[5][15];

        Scanner sc = new Scanner(System.in);

        //입력
        for(int i=1; i < 6; i++){
            System.out.print(i + "번째 문장: ");
            message[i-1] = sc.nextLine().toCharArray();
        }


        //출력
        for(int j = 0; j < message.length; j++){
            for(int k = 0; k < 5; k++){
                if (message[k][j].isEmpty()) {
                    continue;
                }
                else{
                    System.out.print(message[k][j]);
                }
            }
        }     
    }

