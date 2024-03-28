package FourWeek.Yeonsu;

public class 메소드 {
    //메소드정의
    public static void sayHello() {
        System.out.println("안녕하시에오와? 메소드입니다.");
    }

    public static void main(String[] args) {
        System.out.println("메소드 호출 전");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("메소드 호출 후");
    }
}
