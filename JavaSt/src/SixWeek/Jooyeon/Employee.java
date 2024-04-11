package SixWeek.Jooyeon;

// 직원 클래스
class Employee {
    private String name;
    private int employeeID;

    public Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void takeOrder(Customer customer, Order order) {
        System.out.println("주문을 받았습니다: " + customer.getName() + "님의 " + order.getQuantity() + "잔의 " + order.getBeverage().getType() + " " + order.getBeverage().getName());
    }
}

