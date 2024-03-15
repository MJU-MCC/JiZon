package TwoWeek.JooYeong;

public class String_join {
    public static void main(String[] args) {

        //08. 문자열 결합


        //문자열 + 문자열 또는 문자열 + 정수or실수가 가능하다
        String name = "Lee" + "juyoung";
        String str = name + 8.0; 

        System.out.println(name);
        System.out.println(str);

        //빈 문자열도 가능. ""가 앞에 있을 시, 뒤에 숫자를 문자열으로 변환한다
        System.out.println(7 + 7 + " ");
        System.out.println(" " + 7 + 7);

    }
}
