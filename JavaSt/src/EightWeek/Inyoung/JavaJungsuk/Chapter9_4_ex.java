package EightWeek.Inyoung.JavaJungsuk;

// 해시함수는 찾고자하는 값을 입력하면 그 값이 저장된 위치를 알려주는 해시코드를 반환

public class Chapter9_4_ex {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(System.identityHashCode(str1));
        // 객체의 주소값으로 해시코드를 생성하기에 모든 객체에 대해 항상 다른 해시코드값 반환
    }
}
