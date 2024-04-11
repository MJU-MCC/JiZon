package FifthWeek.JongSeok;

public class InClass {
    int a1 = 1000;
    void Method() {
        class LocalClass { //내부 지역 클래스, Method() 내에서만 사용가능
            int a4 = 5;
        }
        LocalClass lc = new LocalClass();
        System.out.println("LocalClass.a4 : " + lc.a4);
    }
    public class InstanceClass { //내부 인스턴스 클래스, Outer클래스의 인스턴스 멤버
        int a2 = 100;

    }

    static class StaticClass {  //내부 스태틱 클래스, Outer클래스의 Static 멤버
        static int a3 = 200;

    }

    static void Staticout(){
        StaticClass sc1 = new StaticClass();
    }


    public static void main(String[] args) {
        InClass first = new InClass();
        // 내부클래스의 경우 외부클래스의 인스턴스를 통해 객체를 생성해야함
        InClass.InstanceClass second = first.new InstanceClass();

        System.out.println("second.a2 : " + second.a2);
        System.out.println("InClass.StaticClass.a3 : " + InClass.StaticClass.a3); //스태틱 클래스이기에 객체 생성없이 가능
        System.out.println("(생략)StaticClass.a3 : " + StaticClass.a3); //  static이기에 생략 가능

        InClass.StaticClass sa3 = new InClass.StaticClass(); //스태틱 내부 클래스는 외부클래스의 인스턴스를 먼저 생성하지 않아도 괜찮다
        System.out.println("sa3.a3 : " + sa3.a3);

       first.Method();

    }
}
