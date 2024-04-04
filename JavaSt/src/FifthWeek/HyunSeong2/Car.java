package FifthWeek.HyunSeong2;

public class Car {
    static int number = 1;

    void outCar(){
        System.out.println("일련번호가 "+ number + "인 차가 출고됩니다.");
        number++;
    }

    static void NoObjectMethod(){
        System.out.println("객체생성없이 사용하는 메서드");
    }
}
