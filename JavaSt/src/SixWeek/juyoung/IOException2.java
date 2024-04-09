package SixWeek.juyoung;

import java.io.FileReader;
import java.io.IOException;

//발표2

public class IOException2 {
    public static void main(String[] args) {
        try {
            // 파일을 읽기 위한 FileReader 객체 생성
            // 여기서 "example.txt" 파일이 존재하지 않으면 FileNotFoundException이 발생할 수 있으며,
            // 이는 IOException의 하위 클래스입니다.
            FileReader fileReader = new FileReader("example.txt");
            
            // 파일 내용을 읽고 출력하는 로직
            // 실제로는 파일에서 데이터를 읽어 처리하는 코드가 위치합니다.
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
            
            // FileReader 리소스를 안전하게 닫습니다.
            fileReader.close();
        } catch (IOException e) {
            // IOException을 catch 블록에서 처리합니다.
            System.out.println("파일을 읽는 도중 문제가 발생했습니다: " + e.getMessage());
        }
        
        System.out.println("프로그램 실행이 계속됩니다.");
    }
}
