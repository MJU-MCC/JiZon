package ThreeWeek.HyunSeong.variabl;

public class PrtPractice {
    public static void main(String[] args) {
        System.out.printf("안녕하세요");
        System.out.printf("%nhello");
        System.out.printf("%nhi%n");
        //백슬래시n이 아니여도 퍼센트n이여도 개행이 가능

        int number = 200;
        System.out.printf("%d %n", number);
        System.out.printf("%5d %n", number);//5칸 만들어서 우측 정렬
        System.out.printf("%-5d %n", number);//5칸 만들어서 좌측 정렬
        System.out.printf("%05d %n", number);//5칸 만들어서 좌측 정렬하고 0으로 채우기
    }
}
