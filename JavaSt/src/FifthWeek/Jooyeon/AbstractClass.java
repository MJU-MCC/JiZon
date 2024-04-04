package FifthWeek.Jooyeon;


/*
추상 클래스
추상 클래스로부터 상속받는 자손 클래스는 오버라이딩을 통해 조상인 추상 클래스의 메소드를 모두 구현해주어야 한다.
만일 조상으로부터 상속받은 추상메소드 중 하나라도 구현하지 않는다면, 자손클래스 역시 추상클래스로 지정해 주어야 한다.

다시 말해, 추상 클래스와 메서드는 구현이 없는 클래스 및 메서드로, 하위 클래스에서 반드시 구현되어야 한다.
 */

// 추상 클래스

abstract class Shape {
    // 추상 메서드
    public abstract double calculateArea(); // 추상 메서드 calculateArea() 선언
}

// 추상 클래스를 상속받는 구체적인 클래스
class Rectangle extends Shape { // 추상 클래스 Shape을 상속받는 Rectangle class
    private double length; // 가로
    private double width; // 세로

    // 생성자
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // 추상 메서드 구현
    @Override // 오버라이드: 상속받은 메서드의 내용을 변경하는 것 (change, modify)
    public double calculateArea() {
        return length * width; // 가로 * 세로
    }
}

// 추상 클래스를 상속받는 Circle class

class Circle extends Shape {
    private double radius; // 반지름

    // 생성자
    public Circle(double radius) {
        this.radius = radius;
    }

    // 추상 메서드 구현
    @Override
    public double calculateArea() { // 넓이 구하는 claculateArea 클래스를 구체화
        return Math.PI * radius * radius;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3); // rectangle 객체 생성 - 가로 길이 : 5, 세로 길이 : 3
        System.out.println("직사각형 넓이: " + rectangle.calculateArea());

        Circle circle = new Circle(4);
        System.out.println("원 넓이: " + circle.calculateArea());
    }
}
