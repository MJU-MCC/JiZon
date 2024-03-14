package TwoWeek.Inyoung.March14;

public class Chapter2_09 {
    public static void main(String[] args) {
        int x = 10, y = 5;
        System.out.println("x=" + x);
        System.out.println("y=" + y);

        // 두 변수 x, y에 저장된 값을 서로 바꾸기
        int tmp = x;    // x의 값을 tmp에 저장
        x = y;          // y의 값을 x에 저장
        y = tmp;        // tmp에 저장된 값을 y에 저장

        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
