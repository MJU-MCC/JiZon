package SixWeek.Jooyeon;

// 음료 추상 클래스
abstract class Beverage {
    private String name;
    private double price;

    public Beverage(String name, double price) { // Beverage 생성자- 음료의 이름, 가격을 인자로 받아와서 객체의 속성 초기화
        this.name = name;
        this.price = price;
    }

    public String getName() { //음료의 이름을 반환하는 getName() 메소드
        return name;
    }

    public double getPrice() { // 음료의 가격을 반환하는 getPrice() 메소드
        return price;
    }

    // 추상 메서드: 음료별 추가 기능 구현을 위해 하위 클래스에서 오버라이드
    public abstract String getType();
}