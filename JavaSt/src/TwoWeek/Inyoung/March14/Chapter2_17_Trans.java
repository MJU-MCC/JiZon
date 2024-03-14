package TwoWeek.Inyoung.March14;

public class Chapter2_17_Trans {
    public static void main(String[] args) {
        // 타입간 변환
        // 1. 숫자를 문자로 변환 : 숫자에 '0'을 더한다.
        System.out.println((char)(3 + '0'));
        // 2. 문자를 숫자로 변환 : 문자에서 '0'을 뺀다.
        System.out.println('3' - '0' + 1);
        // 3. 숫자를 문자열로 변환 : 숫자에 빈문자열 ""을 더한다.
        System.out.println(3 + "");
        // 4. 문자열을 숫자로 변환 : Integer.parseInt() Double.parseDouble()
        System.out.println(Integer.parseInt("3")+1);
        // 5. 문자열을 문자로 변환 : charAt(0)
        System.out.println("3".charAt(0));
        // 6. 문자를 문자열로 변환 : 빈문자열""을 더한다.
        System.out.println('3' + "");
    }
}
