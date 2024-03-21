package ThreeWeek.Jooyeong;
class Animal {}                 //Animal 클래스 정의
class Dog extends Animal {} //Dog 클래스, Animal 클래스 상속
class Cat extends Animal {} //Cat 클래스, Animal 클래스 상속

public class instance_of {
    public static void main(String[] args) {
        Animal myDog = new Dog(); //myDog 객체생성
        Animal myCat = new Cat(); //myCat 객체생성


        //인스턴스란 클래스로부터 생성된 객체
        System.out.println("myDog는 Dog의 인스턴스입니까? " + (myDog instanceof Dog)); // true
        System.out.println("myDog는 Cat의 인스턴스입니까? " + (myDog instanceof Cat)); // false
        System.out.println("myDog는 Animal의 인스턴스입니까? " + (myDog instanceof Animal)); // true
        
        System.out.println("myCat는 Cat의 인스턴스입니까? " + (myCat instanceof Cat)); // true
        System.out.println("myCat는 Dog의 인스턴스입니까? " + (myCat instanceof Dog)); // false
        System.out.println("myCat는 Animal의 인스턴스입니까? " + (myCat instanceof Animal)); // true
        
   
        // null에 대한 instanceof 테스트
        System.out.println("null은 Object의 인스턴스입니까? " + (null instanceof Object)); // false
        //Object 클래스는 java에 모든 클래스의 최상위 클래스
    }
}
