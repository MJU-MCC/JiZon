package FourWeek.JongSeok.Chapter6;

public class Ex6_14 {
    static {
        System.out.println("static{ }"); //클래스 초기화
    }
    {
        System.out.println("{ }"); //인스턴스 초기화
    }
    public Ex6_14(){
        System.out.println("생성자"); //생성자
    }

    public static void main(String[] args) {
        System.out.println("Ex6_14 bt = new Ex6_14()");
        Ex6_14 bt = new Ex6_14();

        System.out.println("Ex6_14 bt2 = new Ex6_14()");
        Ex6_14 bt2 = new Ex6_14();
        // 1. 자동 초기화
        // 2. 명시적 초기화
        // 3. 초기화 블럭
        // 4. 생성자
        // 출력 결과에서 알듯 클래스 초기화는 처음 메모리 로딩 시에 1회 수행
        // 인스턴스 초기화는 인서턴스 생성 시마다 수행
        // 인스턴스 초기화 후 생성자 수행
    }
}
