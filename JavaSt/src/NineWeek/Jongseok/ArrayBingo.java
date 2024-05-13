package NineWeek.Jongseok;
import java.util.*;

public class ArrayBingo {
    public static void main(String[] args) {
        // 1부터 30까지의 숫자를 담은 리스트 생성
        ArrayList numbers = new ArrayList();
        for (int i = 1; i <= 30; i++) {
            numbers.add(i);
        }

        // 리스트를 랜덤하게 섞음
        Collections.shuffle(numbers);

        // 빙고 보드 생성
        int[][] board = new int[5][5];

        // ArrayList를 iterator로 변환
        Iterator<Integer> iterator = numbers.iterator();

        // 보드에 숫자 할당하고 출력
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = iterator.next();
                System.out.print((board[i][j] < 10 ? " " : "") + board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
