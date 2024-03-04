package ThreeWeek.HyunSeong.variabl;

public class StringPrac {
    public static void main(String[] args) {
        String str1 = "kim";
        String str2 = "kim";
        System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));
        System.out.println("System.identityHashCode(str2) = " + System.identityHashCode(str2));
        System.out.println("str1==str2 = " + str1 == str2);
        System.out.println(str1 == str2);
        //내가 미처 알지 못했던 부분 ! (ㅇㅅㅈ ㅇㅅㅅㅇ)


        String kim1 = new String("kim");
        String kim2 = new String("kim");
        System.out.println("System.identityHashCode(kim1) = " + System.identityHashCode(kim1));
        System.out.println("System.identityHashCode(kim2) = " + System.identityHashCode(kim2));
        System.out.println(kim1 == kim2);

        //레퍼런스 참고 : https://velog.io/@jaden_94/String-Class

    }


}
