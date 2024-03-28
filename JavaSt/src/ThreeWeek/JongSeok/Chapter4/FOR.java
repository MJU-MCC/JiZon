package ThreeWeek.JongSeok.Chapter4;

public class FOR {
    public static void main(String[] args) {
        int k = 10;
        for (int i = 0; i <= 10; i++, k--){
            if (i == k){
                System.out.println("둘이 같아졌습니다.");
                System.out.println("i = " + i);
                System.out.println("k = " + k);
            }

        }
    }
}
