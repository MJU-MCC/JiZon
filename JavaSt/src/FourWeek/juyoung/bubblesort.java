package FourWeek.juyoung;

public class bubblesort {
    public static void main(String[] args) {

        //bubblesort
        
        int[] list = {7, 4, 5, 1, 3}; 
        int temp = 0;

        for(int i=0; i<list.length-1; i++){     //list크기-1 / 배열의 index값은 0부터
            //list.length-i-1까지 해야된다. i=0인 경우 list[5]값은 없음(list[4]까지 존재)
            for(int j=0; j<list.length-i-1; j++){   
                //오름차순 정렬
                if (list[j] > list[j+1]) {
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }

        for(int i=0; i<list.length; i++){
            System.out.printf("%d ", list[i]);
        }
    }
}
