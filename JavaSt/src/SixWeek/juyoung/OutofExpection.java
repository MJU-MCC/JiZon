package SixWeek.juyoung;

import java.util.ArrayList;
import java.util.List;

//발표3 

public class OutofExpection {
    public static void main(String[] args) {
        try {
            // 대량의 객체를 저장하기 위한 List 생성
            List<Object> list = new ArrayList<>();
            
            // 무한 루프를 돌면서 계속해서 객체를 생성하여 List에 추가합니다.
            // 이는 OutOfMemoryError를 발생시키기 위한 코드입니다.
            while (true) {
                list.add(new Object());
            }
        } catch (OutOfMemoryError e) {
            // OutOfMemoryError 처리
            System.err.println("메모리 부족: " + e.getMessage());
            // 에러 발생 후 복구 로직 또는 추가적인 처리를 할 수 있습니다.
            // 하지만, 실제로는 여기서 복구가 어려울 수 있습니다.
        }
        
        System.out.println("프로그램 실행이 계속됩니다. 하지만 안정적인 상태인지는 불확실합니다.");
    }
}

