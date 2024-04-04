package FifthWeek.HyunSeong2;

public abstract class Human implements PlusHuman{

    public void Greeting(){
        System.out.println("방가방가 햄토리");
    }

    /*
    추상 클래스는 인터페이스를 받을 수 있다 (구현 가능).
    그러나 인터페이스는 추상클래스를 받을 수 없다(상속 불가능).
    왜 그럴까?
     */
}
