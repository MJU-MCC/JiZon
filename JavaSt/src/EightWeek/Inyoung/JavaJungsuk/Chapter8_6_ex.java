package EightWeek.Inyoung.JavaJungsuk;

public class Chapter8_6_ex {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try{
            System.out.println(3);
            System.out.println(0/0);
            // 0으로 나눠서 ArithmeticException 발생
            System.out.println(4);
        } catch (ArithmeticException ae){
            if(ae instanceof ArithmeticException)
                System.out.println("true");
            System.out.println("ArithmeticException");
        } catch (Exception e){
            //ArithmeticException을 제외한 모든 예외가 처리됨
            System.out.println("Exception");
        }

        System.out.println(6);
    }
}
