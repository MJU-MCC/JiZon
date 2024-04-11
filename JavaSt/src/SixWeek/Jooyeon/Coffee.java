package SixWeek.Jooyeon;

// 커피 클래스
class Coffee extends Beverage {
    public Coffee(String name, double price) {
        super(name, price);
    }

    @Override
    public String getType() {
        return "커피";
    }
}
