package ThreeWeek.HyunSeong;

public interface Car {

    public String move();

    public String washWindow();

    public String stopBreak();

    default String plusDefaultMethod(){
        return "Car 인터페이스에 추가된 메서드입니다, Car인터페이스를 상속받은 클래스들은 " +
                "이 메서드가 추가되었지만 default 키워드 덕분에 꼭 구현해야할 필요가 없어진것이지요.";
    };
}
