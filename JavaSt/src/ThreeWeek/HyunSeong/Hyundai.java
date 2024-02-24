package ThreeWeek.HyunSeong;

public class Hyundai implements Car{
    @Override
    public String move() {
        return "Hyundai 차량이 움직입니다.";
    }

    @Override
    public String washWindow() {
        return "Hyundai 차량이 와이퍼를 작동합니다.";
    }

    @Override
    public String stopBreak() {
        return "Hyundai 차량이 멈춰섭니다.";
    }
}
