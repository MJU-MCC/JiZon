package SixWeek.Inyoung.JavaJungsuk;

class MyMath2 {
    long a, b;

    // 인스턴스 메서드
    // 인스턴스 변수 a,b만을 이용해서 작업하므로 매개변수 필요X
    long add() { return a+b; }
    long substract() { return a-b; }
    long multiply() { return a*b; }
    double divide() { return a/b; }

    // 클래스 메서드(static 메서드)
    // 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능함. a,b는 지역변수
    static long add(long a, long b) { return a+b; }
    static long subtract(long a, long b) { return a-b; }
    static long multiply(long a, long b) { return a*b; }
    static double divide(long a, long b) { return a / (double)b; }
}

public class Chapter6_27_ex {
    public static void main(String[] args) {
        //클래스 메서드 호출. 인스턴스(객체) 생성없이 호출 가능
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.subtract(200L, 100L));
        System.out.println(MyMath2.multiply(200L, 100L));
        System.out.println(MyMath2.divide(200L, 100L));

        MyMath2 mm = new MyMath2(); //인스턴스 생성
        mm.a = 200L;
        mm.b = 100L;

        //인스턴스 메서드 호출 <- 인스턴스(객체)생성한 후에서야 호출이 가능해짐
        System.out.println(mm.add());
        System.out.println(mm.substract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}
