package ThreeWeek.Jooyeong;

public class mathran {
    //for문 + Math.random()
    public static void main(String[] args) {
        //Math.random()을 생성하게 되면, 0.0은 범위에 포함되고 1.0은 포함되지 않는다
        // 0.0 <= Math.random() < 1.0

        int num = 0;

        //1과 6사이의 난수 출력(5번 반복)
        for (int i = 1; i < 5; i++){
            num = (int) (Math.random() * 6) + 1;
            System.out.println(num);
        }
    }
    
}
