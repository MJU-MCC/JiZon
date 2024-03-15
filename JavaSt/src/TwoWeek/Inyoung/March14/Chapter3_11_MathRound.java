package TwoWeek.Inyoung.March14;

public class Chapter3_11_MathRound {
    public static void main(String[] args) {
        // Math.round()로 반올림하기
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0; //1000.0으로 나누기한 이유는 정수끼리 나눗셈하면 int니까
        System.out.println(shortPi);
    }
}
