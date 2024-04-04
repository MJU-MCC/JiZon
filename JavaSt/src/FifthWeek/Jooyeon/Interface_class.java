package FifthWeek.Jooyeon;

// Animal 인터페이스 정의
interface Animal {
    void makeSound(); // 동물이 소리를 내는 메서드
}

// Dog 클래스는 Animal 인터페이스를 구현합니다.
class Dog implements Animal {
    // Animal 인터페이스의 메서드를 오버라이드하여 강아지가 짖는 소리를 출력합니다.
    public void makeSound() {
        System.out.println("멍멍");
    }
}

// Cat 클래스는 Animal 인터페이스를 구현합니다.
class Cat implements Animal {
    // Animal 인터페이스의 메서드를 오버라이드하여 고양이가 짖는 소리를 출력합니다.
    public void makeSound() {
        System.out.println("야옹");
    }
}

public class Interface_class {
    public static void main(String[] args) {
        // Dog 객체 생성
        Dog dog = new Dog();
        // Cat 객체 생성
        Cat cat = new Cat();

        // 강아지와 고양이가 소리를 내도록 메서드 호출
        dog.makeSound();
        cat.makeSound();
    }
}
