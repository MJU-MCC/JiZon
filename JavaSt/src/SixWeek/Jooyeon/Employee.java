package SixWeek.Jooyeon; // SixWeek 패키지 내 Jooyeon 패키지에 속하는 클래스

// 직원 클래스
class Employee { // 직원 클래스 선언
    private String name; // 직원 이름을 저장하는 변수
    private int employeeID; // 직원 ID를 저장하는 변수

    public Employee(String name, int employeeID) { // 직원 객체 생성자 정의, 이름과 ID를 매개변수로 받음
        this.name = name; // 객체의 이름 멤버 변수에 매개변수로 받은 이름을 할당
        this.employeeID = employeeID; // 객체의 ID 멤버 변수에 매개변수로 받은 ID를 할당
    }

    public String getName() { // 직원의 이름을 반환하는 메서드
        return name; // 직원의 이름 반환
    }

    public int getEmployeeID() { // 직원의 ID를 반환하는 메서드
        return employeeID; // 직원의 ID 반환
    }

    public void takeOrder(Customer customer, Order order) { // 주문을 받는 메서드
        System.out.println("주문을 받았습니다: " + customer.getName() + "님의 " + order.getQuantity() + "잔의 " + order.getBeverage().getType() + " " + order.getBeverage().getName());
        // 주문을 받았음을 출력, 주문 고객의 이름, 주문 수량, 음료 종류, 음료 이름 출력
    }
}
