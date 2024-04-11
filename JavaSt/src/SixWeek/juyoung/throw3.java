package SixWeek.juyoung;

public class throw3 {
    public static void main(String[] args) throws Exception{
        method1();
    }

    static void method1() throws Exception {
//        method2 md2 = new method2();
        method2();
    }
    
    static void method2() throws Exception {
        throw new Exception();
    }


}