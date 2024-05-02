package SixWeek.Jooyeon;

import java.util.*;

public class CafeProgram {
    public static void main(String[] args) {
        // 메뉴 설정
        Menu menu = new Menu(); //menu 객체 설정

        // 커피와 주스 메뉴를 추가합니다.
        menu.addBeverage(new Coffee("아메리카노", 3000)); // 음료 이름과 가격을 가진 Coffee 객체를 생성하고, 그 객체를 메뉴에 추가
        menu.addBeverage(new Coffee("카페라떼", 3500)); // "카페라떼"라는 이름과 3500원이라는 가격을 가진 Coffee 객체를 생성하고, 이를 menu에 추가합니다.
        menu.addBeverage(new Coffee("카페모카", 4000));
        menu.addBeverage(new Coffee("카푸치노", 3500));
        menu.addBeverage(new Coffee("카라멜 마끼아또", 4000));
        menu.addBeverage(new Coffee("에스프레소", 2500));
        menu.addBeverage(new Juice("아이스티", 3000));
        menu.addBeverage(new Juice("딸기 주스", 3500));
        menu.addBeverage(new Juice("딸기 라떼", 4000));

        // 고객 생성
        Customer customer = new Customer("고객");

        // 직원 생성
        Employee employee = new Employee("직원", 1001);

        // 메뉴 출력
        System.out.println("===== 메뉴 =====");
        List<Beverage> beverages = menu.getBeverages(); //menu 객체의 음료 리스트를 beverages 리스트에 저장

        for (int i = 0; i < beverages.size(); i++) {
            System.out.println((i + 1) + ". " + beverages.get(i).getName() + " - " + beverages.get(i).getPrice() + "원");
        }                                       // get(i) 메소드 - 리스트 인터페이스 내의 있는 메소드로 index를 반환한다.

        // 주문 생성
        Scanner scanner = new Scanner(System.in);
        List<Order> orders = new ArrayList<>();

        while (true) {
            System.out.print("주문할 음료의 번호를 선택하세요 (종료하려면 -1 입력): ");
            int choice = scanner.nextInt(); // 선택한 음료 번호를 입력받는다.
            if (choice == -1) {
                break;
            }
            scanner.nextLine(); // 버퍼 비우기 - nextInt()를 호출하면 개행 문자(\n)가 입력 버퍼에 남아 있게 되기 때문
            int menuSize = beverages.size();
            if (choice < 1 || choice > menuSize) {
                System.out.println("잘못된 번호를 입력하셨습니다. 1부터 " + menuSize + "까지의 번호를 입력해주세요.");
                continue;
            }
            System.out.print("주문할 잔 수를 입력하세요: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            while (quantity <= 0) {
                System.out.println("수량은 0보다 커야 합니다.");
                System.out.println("주문할 잔 수를 입력하세요: ");
                quantity = Integer.parseInt(scanner.nextLine());
            }
            Beverage selectedBeverage = beverages.get(choice - 1);
            Order order = new Order(selectedBeverage, quantity); // 주문 객체 생성
            orders.add(order); // 주문 리스트에 주문 추가
        }


        scanner.close(); // Scanner 닫는다.

        // 주문 처리
        for (Order order : orders) {
            employee.takeOrder(customer, order); // 직원이 주문을 받아 처리한다.
        }

        // 주문 금액 계산
        double totalPrice = 0;
        for (Order order : orders) {
            totalPrice += order.calculateTotalPrice(); // 주문 총액을 계산한다.
        }
        System.out.println("주문 총액: " + totalPrice + "원");
    }
}