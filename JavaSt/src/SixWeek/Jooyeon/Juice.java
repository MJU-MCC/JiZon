package SixWeek.Jooyeon;

// 주스 클래스
class Juice extends Beverage {
    public Juice(String name, double price) {
        super(name, price);
    }

    @Override
    public String getType() {
        return "주스";
    }
}