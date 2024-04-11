package SixWeek.Jooyeon;

// 주문 클래스
class Order {
    private Beverage beverage; // 음료 객체를 저장하기 위한 변수 선언

    private int quantity; // 주문 수량을 저장하기 위한 변수 선언

    public Order(Beverage beverage, int quantity) { // 주문 객체 생성자 정의, 음료와 수량을 매개변수로 받음
        this.beverage = beverage; // 주문 객체의 음료 멤버 변수에 매개변수로 받은 음료를 할당
        this.quantity = quantity; // 주문 객체의 수량 멤버 변수에 매개변수로 받은 수량을 할당
    }

    public Beverage getBeverage() { // 주문 객체의 음료를 반환하는 메소드
        return beverage; // 주문 객체의 음료 반환
    }

    public int getQuantity() { // 주문 객체의 수량을 반환하는 메소드
        return quantity; // 주문 객체의 수량 반환
    }

    public double calculateTotalPrice() { // 주문 총 가격을 계산하는 메소드
        return beverage.getPrice() * quantity; // 음료의 가격과 수량을 곱하여 총 가격 반환
    }
}