package EightWeek.Hyunseong;

public class NineMain {
    public static void main(String[] args) {
        try{
//            Exception e = new Exception();
//            throw e;
            System.out.println(0/0);
            // 1. 앞에 0이 문제다
            // 2. 뒤에 0이 문제다
            // 3. 둘 다 문제다
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(" 예외 메시지 :" + e.getMessage());
            return;
        }finally{
            System.out.println("hello" ); // return 만나도 실행됨
        }
        System.out.println("hellooooo"); // return 만나면 실행 안됨

        // finally 안에 쓰는 거랑 밖에 쓰는 거랑 차이가 뭐임?
        // return;을 만났을 때도 실행되는 게 finally
    }
}
