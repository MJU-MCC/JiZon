package ThreeWeek.JongSeok.Chapter4;

public class WHILE {
    public static void main(String[] args) {
        int i = 0;
        int k = 10;
        while(i != k){
            i++;
            k--;

        }
        if(i == k){
            System.out.println("둘이 같아졌습니다.");
            System.out.println("i = " + i);
            System.out.println("k = " + k);
        }
    }
}
