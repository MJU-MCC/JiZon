package SixWeek.Jooyeon; // SixWeek 패키지의 Jooyeon 서브패키지에 속하는 클래스를 정의

// 커피 클래스
class Coffee extends Beverage { // Beverage 클래스를 상속받는 Coffee 클래스
    // 생성자: 이름(name)과 가격(price)을 매개변수로 받아 초기화
    public Coffee(String name, double price) {
        super(name, price); // 부모 클래스(Beverage)의 생성자를 호출하여 필드를 초기화
    }

    // 재정의된 getType() 메소드.
    @Override
    public String getType() {
        return "커피"; // 커피 타입을 나타내는 문자열을 반환
    }
}
