package TwelveWeek.Jooyeon;

// 필요한 클래스들을 임포트
import java.util.ArrayList; // ArrayList를 사용하기 위한 임포트
import java.util.Comparator; // 객체를 비교하는 데 사용되는 Comparator 인터페이스 임포트
import java.util.List; // List 인터페이스를 사용하기 위한 임포트
import java.util.Map; // Map 인터페이스를 사용하기 위한 임포트
import java.util.stream.Collectors; // 스트림을 다양한 형태로 변환하는 Collectors 유틸리티 클래스 임포트

//직원 정보를 담는 Employee 클래스를 정의
class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;

    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

