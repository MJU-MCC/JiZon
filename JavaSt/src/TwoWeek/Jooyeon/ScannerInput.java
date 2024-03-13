package TwoWeek.Jooyeon;
import java.util.*; //Scanner 클래스를 사용하기 위해 import
public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner 객체를 생성
        System.out.println("정수를 입력하세요: ");
        String input = sc.nextLine(); // nextLine()을 통해 한 줄의 문자열을 읽어서 input에 저장
        int num  = Integer.parseInt(input); // input을 Integer.parseInt()를 통해 정수로 변환 후 num에 저장

        System.out.println("입력내용: "+ input);
        System.out.printf("num= %d%n", num);// printf는 지시자를 통해 변수의 값 여러 가지 형식으로 변환하여 출력 가능
    }
}
