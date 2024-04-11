package SixWeek.Jooyeon;

import java.util.ArrayList;
import java.util.List;

// 메뉴 클래스
class Menu {
    private List<Beverage> beverages;

    public Menu() {
        this.beverages = new ArrayList<>();
    }

    public void addBeverage(Beverage beverage) {
        beverages.add(beverage);
    }

    public List<Beverage> getBeverages() {
        return beverages;
    }
}