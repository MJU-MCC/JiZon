package TwelveWeek.juyoung;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 각 분식 메뉴 객체를 생성
        Tteokbokki tteokbokki = new Tteokbokki(3000, "매운맛");
        Kimbap kimbap = new Kimbap(2500, Arrays.asList("단무지", "오이", "당근", "계란", "햄"));
        Sundae sundae = new Sundae(5500, "대");

        // 주문 객체를 생성하고 메뉴를 추가
        Order order = new Order();
        order.addMenu(tteokbokki);
        order.addMenu(kimbap);
        order.addMenu(sundae);

        // 주문 내역을 출력
        order.showOrder();
    }
}