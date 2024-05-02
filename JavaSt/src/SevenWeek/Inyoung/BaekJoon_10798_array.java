package SevenWeek.Inyoung;

import java.util.Scanner;

public class BaekJoon_10798_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[][] array = new char[5][6];


        for (int i = 0; i < array.length; i++) { //전체 행의 개수
            String row = sc.nextLine();

            for (int j = 0; j < row.length(); j++) { //한 줄(행)당 몇 개?
                array[i][j] = row.charAt(j);
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[j][i]);
            }
        }

        //왜 자꾸 "" 이런게 출력되지..? 아스키문잔가 어떻게 없애지?
        //next()에서 nextLine()으로 바꿔도 문제가 해결이 안됨.

    }
}
