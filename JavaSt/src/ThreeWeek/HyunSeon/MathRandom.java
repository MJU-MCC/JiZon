package ThreeWeek.HyunSeon;

public class MathRandom {
    public static void main(String[] args) {
        // 복권 6 + 1
        int num =0;
        for(int i=0;i<=6; i++){
            num = (int)(Math.random()*45)+1;
            System.out.println(num);
        }
    }
}
