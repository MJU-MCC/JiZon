package TwoWeek.Inyoung.March14;
import java.util.Scanner; // Scanner클래스를 사용하기 위해 추가

public class Chapter2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // Scanner클래스의 객체를 생성

        System.out.print("두자리 정수를 하나 입력해주세요.>");
        String input = scanner.nextLine();
        // nextLine() 메서드 : 입력받은 내용을 input에 저장
        int num = Integer.parseInt(input);
        // Integer.parseInt() 메서드 : 입력받은 내용을 int 타입의 값으로 변환
        // Scanner 클래스의 nextInt(), nextFloat() 메서드 사용 가능

        System.out.println("입력내용 :" + input);
        System.out.printf("num=%d%n", num);
    }
}
