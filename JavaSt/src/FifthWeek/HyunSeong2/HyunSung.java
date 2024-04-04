package FifthWeek.HyunSeong2;


public class HyunSung {
    public static void main(String[] args) throws Exception {
        //Ztatic이라는 타입의 객체를 생성하지 않고도 Ztatic에 있는 변수 number을 가져올수있다.
        System.out.println("Ztatic.number = " + Ztatic.number);
        System.out.println("Ztatic.ReturnNumber() = " + Ztatic.ReturnNumber());

        /*
        그렇다면 static을 왜 사용하는것이 좋은가?
        코드롤 설명하겠다.

        프로그래밍 설계의도는 차를 찍어내는 공장에서 차를 만들때마다 차의 일련번호(고유번호)를 부여하는 프로그램을 개발하고 싶다.
         */
        Car car1 = new Car();
        car1.outCar();
        Car car2 = new Car();
        car2.outCar();
        Car car3 = new Car();
        car3.outCar();

        /*
        이렇게 Car클래스에 number를 static을 붙이지 않으면 인스턴스 변수가 되기때문에
        객체를 생성할때마다 number는 1이 초기화되기에
        이 공장에서 만들어지는 모든 차의 일련번호는 무조건 1이 되어버린다.
        그렇기 때문에 static을 만들어서 number를 클래스레벨로 올려 Car타입의 인스턴스들은 number을 공유 할 수 있도록 해야한다.
         */

        Car.NoObjectMethod();
        /*
        객체를 생성하게 될 경우 메모리를 할 당해야 하기에 만약 각 객체마다 같은 동작을 수행해야한다면
        static 메서드를 이용해서 메모리라는 자원을 아껴서 사용할 수 있게 된다.
         */
    }

}
