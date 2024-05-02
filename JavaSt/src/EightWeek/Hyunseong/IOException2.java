package EightWeek.Hyunseong;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


//입출력에러

public class IOException2 {
    public static void main(String[] args) {
        try {
            // 파일을 읽기 위한 FileReader 객체 생성
            // 여기서 "example.txt" 파일이 존재하지 않으면 FileNotFoundException이 발생할 수 있으며,
            // 이는 IOException의 하위 클래스입니다.
            FileReader fileReader = new FileReader("example.txt"); //그냥 파일을 열었음(example.txt파일을 생성하지 않았음)
            
            // 파일 내용을 읽고 출력하는 로직
            // 실제로는 파일에서 데이터를 읽어 처리하는 코드가 위치합니다.
            int i;
            //파일에서 문자를 하나 읽고, 그 문자가 파일의 끝을 나타내는 -1이 아니라면
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
            
            // FileReader 리소스를 안전하게 닫습니다.
        } catch (FileNotFoundException e) {
            // IOException을 catch 블록에서 처리합니다.
            System.out.println("파일을 읽는 도중 문제가 발생했습니다: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("파일을 읽는 도중 문제가 발생했습니다: " + e.getMessage());
        }
        
        System.out.println("프로그램 실행이 종료됩니다.");
    }
}
