package EightWeek.Inyoung;

public class Study {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        // append()를 통해 문자열 연결
        stringBuilder.append("안")
        .append("녕");
        // toString()을 통해 문자열 변수에 할당
        String str = stringBuilder.toString();

        System.out.println(stringBuilder);
        System.out.println(str);

        StringBuffer str2 = new StringBuffer("Hello");

        System.out.println(str2); // Hello
        System.out.println(str2.append(" Java!")); // Hello Java!
        System.out.println(str2); // Hello Java!
        System.out.println(str2.insert(5, " World"));
        System.out.println(str2);

        // StringBuffer에서 스레드의 동기화를 뺸게 StringBuilder. 동기화는 성능저하시킴.
    }
}
