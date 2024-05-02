package EightWeek.Hyunseong;

public class NullpointExample {

    //참조에러 (NULL값 참조)
    
    public static void main(String[] args) {
        // null 값을 가지는 객체 참조 선언
        String text = null;

        try {
            // 객체 참조가 null이므로 이 구문을 실행할 때 NullPointerException이 발생합니다.
            System.out.println(text.length());
        } catch (NullPointerException e) {
            // NullPointerException을 catch 블록에서 처리합니다.
            System.out.println("text가 null이어서 길이를 구할 수 없습니다.");
        }

        System.out.println("프로그램 실행이 종료됩니다.");
    }
}
