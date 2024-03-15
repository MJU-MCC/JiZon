package TwoWeek.Inyoung.March14;

public class Chapter2_12_printf {
    public static void main(String[] args) {
        /*
        지시자 종류
        %d : 정수
        %f : 실수
        %c : 문자
        %s : 문자열
         */

        String url = "www.codechobo.com";
        float f1 = .10f;    // 0.1
        float f2 = 1e1f;    // 10.0 -? 이 e표현법 모르겠음
        float f3 = 3.14e3f; // 3140
        double d = 1.23456789;
        System.out.printf("f1=%f%n", f1);    //"printf"
        System.out.printf("f2=%f%n", f2);    //"printf"
        System.out.printf("f3=%f%n", f3);    //"printf"
        System.out.printf("d=%f%n", d);
        System.out.printf("d=%14.10f%n", d);    // 전체 글자 14자리 중 소수점 10자리. 오른쪽 정렬
        System.out.printf("[12345678901234567890]%n");
        System.out.printf("%s%n", url);
        System.out.printf("[%20s]%n", url);     // 최소 20글자 출력공간 확보. 오른쪽 정렬
        System.out.printf("[%-20s]%n", url);    // 최소 20글자 출력공간 확보. 왼쪽 정렬
        System.out.printf("[%.8s]%n", url);     // 왼쪽에서 8글자까지만 출력
    }
}
