package SixWeek.Jooyeon; // SixWeek 패키지 내 Jooyeon 패키지에 속하는 클래스

// 주스 클래스
class Juice extends Beverage { // Beverage 클래스를 상속받는 Juice 클래스 선언
    public Juice(String name, double price) { // 주스 객체 생성자 정의, 이름과 가격을 매개변수로 받음
        super(name, price); // 부모 클래스의 생성자 호출하여 이름과 가격 설정
    }

    @Override
    public String getType() { // Beverage 클래스의 getType 메서드를 오버라이드
        return "주스"; // 주스의 종류를 나타내는 문자열 반환
    }
}
