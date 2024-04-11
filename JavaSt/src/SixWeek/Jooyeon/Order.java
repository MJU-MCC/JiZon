package SixWeek.Jooyeon;

// 주문 클래스
class Order {
    private Beverage beverage;
    private int quantity;

    public Order(Beverage beverage, int quantity) {
        this.beverage = beverage;
        this.quantity = quantity;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public int getQuantity() {
        return quantity;
    }

    public double calculateTotalPrice() {
        return beverage.getPrice() * quantity;
    }
}