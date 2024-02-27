package ThreeWeek.HyunSeong.Baekjoon;

import java.io.*;

public class B3052 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean arr[] = new boolean[42];

        for(int i=0; i<10; i++){
            //readLine메서드가 한 줄씩 입력을 받기 때문이다.
            int num = Integer.parseInt(br.readLine());
            //42로 나눈 숫자는 0부터 41까지이다.
            int index = num % 42;
            //나눈 나머지에 해당하는 숫자의 인덱스는 true로 나머지 계산이 되었다고 표시한다.
            arr[index] = true;
        }
        //인덱스가 나머지 숫자인 개수를 세기 위하여 count 변수를 초기화해준다.
        int count =0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]){
                //위에서 나머지에 해당하는 인덱스가 true인 경우 카운트 1을 올려준다.
                count++;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(count);

        System.out.println(sb);

    }
}
