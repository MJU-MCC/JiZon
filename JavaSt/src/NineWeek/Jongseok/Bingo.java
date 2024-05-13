package NineWeek.Jongseok;
import java.util.*;

public class Bingo {
    public static void main(String[] args) {
        // 중복을 허용하지 않는 set 생성
        HashSet set = new HashSet();

        // 1부터 30까지의 숫자를 랜덤하게 선택하여 set에 추가
        for(int i = 0; set.size() < 25; i++){
            set.add((int)(Math.random() * 30) +  1 + "");
        }
        // 빙고 보드 생성
        int[][] board = new int[5][5];

        // set을 iterator로 변환
        Iterator it = set.iterator();

        // 보드에 숫자 할당하고 출력
        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                board[i][j] = Integer.parseInt((String) it.next());
                System.out.print((board[i][j] < 10 ? " " : "") + board[i][j] + " ");
            }
            System.out.println();
        }
    }
}


