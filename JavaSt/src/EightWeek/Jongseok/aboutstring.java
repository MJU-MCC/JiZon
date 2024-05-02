package EightWeek.Jongseok;

public class aboutstring {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" world");
        String str3 = "hello world";
        String str4 = "hello";
        String str5 = new String("hello");
        System.out.println("str1 주소 :" + Integer.toHexString(System.identityHashCode(str1)));
        System.out.println("str2 주소 :" + Integer.toHexString(System.identityHashCode(str2)));
        System.out.println("str3 주소 :" + Integer.toHexString(System.identityHashCode(str3)));
        System.out.println("str4 주소 :" + Integer.toHexString(System.identityHashCode(str4)));
        System.out.println("str5 주소 :" + Integer.toHexString(System.identityHashCode(str5)));
        System.out.println("str1 == str4 " + (str1 == str4));
        System.out.println("str1 == str5 " + (str1 == str5));
        System.out.println("str1.equals(str5) " +str1.equals(str5));
        System.out.println();
        System.out.println("str2와 str3의 해시코드 " + (str2.hashCode() == str3.hashCode()));
        System.out.println("str2 == str3 " + (str2 == str3));
        System.out.println("hello world 주소 :" + Integer.toHexString(System.identityHashCode("hello world")));
        System.out.println("str2 == hello world " + (str2 == "hello world"));
        System.out.println("str3 == hello world " + (str3 == "hello world"));
        System.out.println("str2.equals(str3) " + str2.equals(str3));
        System.out.println("str1 + \" world\" == str3 " +((str1 + " world") == str3));
        System.out.println("str3.equals(str1 + \" world\") " + str3.equals(str1 + " world"));

    }
}
