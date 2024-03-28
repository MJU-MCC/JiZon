package FourWeek.Jooyeon;

public class Member_Instance {
    static int class_var = 10; // 클래스 변수
    int instance_var = 20; // 인스턴스 변수

    // 클래스 메서드(static 메서드) - 클래스 변수를 참조할 수 있음
    static void classMethod() {
        System.out.println("클래스 메소드 - class_var: " + class_var);
        // System.out.println("Class method - instance_var: " + instance_var); // 컴파일 에러
        // 클래스 메서드에서 인스턴스 변수를 직접 참조할 수 없음
    }

    // 인스턴스 메서드 - 클래스 변수와 인스턴스 변수를 모두 참조할 수 있음
    void instanceMethod() {
        System.out.println("인스턴스 메소드 - class_var: " + class_var);
        System.out.println("인스턴스 메소드 - instance_var: " + instance_var);
    }

    public static void main(String[] args) {
        Member_Instance example1 = new Member_Instance();
        Member_Instance example2 = new Member_Instance();

        // 클래스 변수(class_var)에 접근
        System.out.println("클래스 변수에 접근 " + Member_Instance.class_var);

        // 인스턴스 변수(instance_var)에 접근
        System.out.println("인스턴스 변수(instance_var)에 접근: " + example1.instance_var);
        System.out.println("ex2 객체를 통한 인스턴스 변수(instance_var)에 접근: " + example2.instance_var);

        // 클래스 메서드 호출
        Member_Instance.classMethod();

        // 인스턴스 메서드 호출
        example1.instanceMethod();
        example2.instanceMethod();
    }
}
