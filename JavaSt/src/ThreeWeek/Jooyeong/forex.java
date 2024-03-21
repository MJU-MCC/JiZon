package ThreeWeek.Jooyeong;

public class forex {
    public static void main(String[] args) {
        //for문 연습

        //삼각형모양 출력
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.printf("\n\n\n\n");
        //역으로 출력
        for(int i=5; i>=0; i--){
            for(int j=5; j>=0; j--){
                if (i<j) {
                    System.out.printf(" ");
                } else System.out.printf("*");
            }
            System.out.println();
        }
            
    }
}
