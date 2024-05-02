package EightWeek.Inyoung.JavaJungsuk;

public class Chapter8_5_ex {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            System.out.println(0/0);
            System.out.println(2); //실행X
        } catch (ArithmeticException ae){
            System.out.println(3);
        }

        System.out.println(4);
    }
}
