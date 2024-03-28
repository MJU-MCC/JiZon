package FourWeek.Yeonsu;

public class Quiz_매서드 {
    public static String getHiddenData(String data, int index){
        String hiddenData = data.substring(0, index);
        for (int i = index; i < data.length(); i++) {
            hiddenData +="*";//나**

        }
        return hiddenData;
    }
    //실행 결과
    //이름:나**
    //주민등록번호:990130-1******
    //전화번호: 010-1234-****

    //힌트
    //substring()
    //length()
    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}
