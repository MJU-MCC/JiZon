package ThreeWeek.HyunSeon;

public class DefaultValue {
    static String x;
    static String y = x;
    public static void main(String[] args) {
        // int x;
        // int y = x; // error : 지역 변수는 초기화 필수
        System.out.println(y); // 클래스 변수 y
    }
}
