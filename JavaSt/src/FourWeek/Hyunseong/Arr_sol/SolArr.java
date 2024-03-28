package FourWeek.Hyunseong.Arr_sol;
import java.util.*;
public class SolArr {
    public static void main(String[] args) {

        String[] stringArray = {"apple", "banana", "choco", "dinner", "english"};
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};

        //각 출력값을 예상하고 출력해보기
        System.out.println("charArray = " + charArray);
        System.out.println("stringArray = " + stringArray);
        System.out.println("Arrays.toString(stringArray) = " + Arrays.toString(stringArray));

        /*
        String은 char배열이 모여서 만들어진 문자열이기 때문에 char배열은 Array.toString메서드를 사용하지 않더라도
        char배열은 문자열로 출력이 된다.
        그러나 나머지 int,String, 기타 배열은 객체로 생성되기 때문에 객체 주소가 나오게 된다.
         */
        
    }
}
