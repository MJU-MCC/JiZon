package SixWeek.Jooyeon;

import java.util.ArrayList;
import java.util.List;

// 메뉴 클래스
class Menu {
    private List<Beverage> beverages; //Beverage 객체들을 담을 수 있는 List 타입의 beverages라는 변수를 선언

    public Menu() {
        this.beverages = new ArrayList<>();
        //Menu 클래스의 생성자로, 클래스의 인스턴스를 초기화할 때
        // 내부의 beverages 리스트를 새로운 빈 ArrayList 객체로 초기화한다.
    }

    public void addBeverage(Beverage beverage) {
        beverages.add(beverage);
        // 이 메서드는 Beverage 객체를 beverages 리스트에 추가. 즉, 메뉴에 음료를 추가하는 기능을 수행.
    }

    public List<Beverage> getBeverages() {
        return beverages; // beverages 리스트를 반환하는 getBeverages() 메소드
    }
}