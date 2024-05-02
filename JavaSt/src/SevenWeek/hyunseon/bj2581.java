package SevenWeek.hyunseon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum=0;
        int min=Integer.MAX_VALUE;
        int count;

        for(int i=m;i<=n;i++){
            count=0;
            int end = (int)Math.sqrt(i);
            for(int j=2;j<=end;j++){
                if(i%j==0){
                    break;
                }
                count++;
            }
            if(count == end-1){
                if(i>1){
                    sum+=i;
                    if(min>i){
                        min = i;
                    }
                }
            }
        }
        if(sum==0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
