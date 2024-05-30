package TwelveWeek.juyoung;
import java.util.ArrayList;
import java.util.List;

//김밥, 순대, 떡볶이 주문
public class Order {
    private List<Bunsik> menu;

    //생성자    
    public Order() {
        this.menu = new ArrayList<>();
    }

    // 메뉴 추가
    public void addMenu(Bunsik bunsik) {
        menu.add(bunsik);
    }

    // 주문한 메뉴를 출력한다
    public void showOrder() {
        for (Bunsik item : menu) {
            System.out.println(item);
            System.out.println(item.cook());
            System.out.println("------");
        }
    }
}
