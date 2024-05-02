package EightWeek.Jongseok;
//try-catch에서 예외처리가 되지않으면 메서드는 종료
public class Ex8_5 {
        static void method1(){
            try {
                method2();
                System.out.println(1);
            } catch (ArithmeticException a){ //NullPointerException로 하면 4출력
                System.out.println(2);
            } finally {
                System.out.println(3);
            }
            System.out.println(4);
        }

        static void method2(){
            throw new NullPointerException();
        }

        public static void main(String[] args) {
            try {
                method1();
            } catch (Exception e){
                System.out.println(5);
            }
        }
}
