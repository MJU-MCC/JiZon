package FourWeek.juyoung;

public class insertionsort {
    public static void main(String[] args) {
        
        //Insertion sort

        int[] arr = {4, 3, 2, 10, 12};

        //2번째 배열부터 시작.
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // 배열의 이전 요소들을 비교하며, key보다 큰 값을 한 칸씩 뒤로 옮깁니다.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // key를 적절한 위치에 삽입합니다.
            arr[j + 1] = key;
        }

        // 정렬된 배열 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
