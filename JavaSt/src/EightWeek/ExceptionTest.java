package EightWeek;

public class ExceptionTest {
    public static void main(String[] args) {
        int n1, n2;

        n1 = 12;
        n2 = 0;

        try {
            System.out.println(n1/n2); // 이 부분에서 예외 발생 가능
        } catch (Exception e) {
            System.out.println("예외 메시지입니다.: "+e.getMessage()); // 예외가 발생하면 예외 메시지 출력
        } finally {
            System.out.println("Finally 블록으로 무조건 발생하는 구문"); // finally 블록은 항상 실행되는 구문
        }
    }
}
