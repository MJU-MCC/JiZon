package TwoWeek.Inyoung.March14;

public class Chapter3_12_Operator2 {
    public static void main(String[] args) {
        // 나머지 연산자%는 나누는 수로 음수도 허용.
        // 그러나 부호는 무시. 결과에 나눠지는 수의 부호 붙이기
        System.out.println(-10%8);  //-2
        System.out.println(10%-8);  //2
        System.out.println(-10%-8); //-2

        /* 문자열의 비교
        문자열을 비교할 때는 '=='대신 equals() 메서드를 사용.
        '=='는 두 문자열이 완전히 같은지를 비교할 뿐이므로
        문자열의 '내용'을 비교하고자 하면 equals()를 사용하자

        원래 String은 클래스이므로 new를 사용해서 객체를 생성해야 함.
        하지만 특별히 간단히 쓰기를 허용함.
        */

        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc" =="abc");
        System.out.printf(" str1==\"abc\" ? %b%n", str1 == "abc");
        System.out.printf(" str2==\"abc\" ? %b%n", str2 == "abc");
        System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
        System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
        System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
        System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
        // 대소문자 구별하지 않고 비교
    }
}
