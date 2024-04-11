package SixWeek.Jooyeon;

import java.util.*;

public class CafeProgram {
    public static void main(String[] args) {
        // 메뉴 설정
        Menu menu = new Menu();
        menu.addBeverage(new Coffee("아메리카노", 3000)); // 음료 이름과 가격을 가진 Coffee 객체를 생성하고, 그 객체를 메뉴에 추가
        menu.addBeverage(new Coffee("카페라떼", 3500));
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
        List<Beverage> beverages = menu.getBeverages();
        for (int i = 0; i < beverages.size(); i++) {
            System.out.println((i + 1) + ". " + beverages.get(i).getName() + " - " + beverages.get(i).getPrice() + "원");
        }

        // 주문 생성
        Scanner scanner = new Scanner(System.in);
        List<Order> orders = new ArrayList<>();

       /* while (true) {
            try {
                System.out.print("주문할 음료의 번호를 선택하세요 (종료하려면 -1 입력): ");
                int choice = Integer.parseInt(scanner.nextLine()); // 개행 문자 제거
                if (choice == -1) {
                    break;
                }
                int menuSize = beverages.size();
                if (choice < 1 || choice > menuSize) {
                    throw new IllegalArgumentException("잘못된 번호를 입력하셨습니다. 1부터 " + menuSize + "까지의 번호를 입력해주세요.");
                }
                System.out.print("주문할 잔 수를 입력하세요: ");
                int quantity = Integer.parseInt(scanner.nextLine()); // 개행 문자 제거
                if (quantity <= 0) {
                    if (quantity < 0) {
                        System.out.println("잘못된 수량을 입력하셨습니다. 0보다 큰 수량을 입력해주세요.");
                    } else {
                        System.out.println("주문할 수량은 1 이상이어야 합니다.");
                    }
                    continue;
                }
                Beverage selectedBeverage = beverages.get(choice - 1);
                Order order = new Order(selectedBeverage, quantity);
                orders.add(order);
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력하세요.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        */

        while (true) {
            System.out.print("주문할 음료의 번호를 선택하세요 (종료하려면 -1 입력): ");
            int choice = scanner.nextInt();
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
            Order order = new Order(selectedBeverage, quantity);
            orders.add(order);
        }


        scanner.close();

        // 주문 처리
        for (Order order : orders) {
            employee.takeOrder(customer, order);
        }

        // 주문 금액 계산
        double totalPrice = 0;
        for (Order order : orders) {
            totalPrice += order.calculateTotalPrice();
        }
        System.out.println("주문 총액: " + totalPrice + "원");
    }
}