package ThreeWeek.HyunSeong;

public class Kia extends Company implements Car{
    @Override
    public String move() {
        return "Kia 차량이 움직입니다.";
    }

    @Override
    public String washWindow() {
        return "Kia 차량이 와이퍼를 작동합니다.";
    }

    @Override
    public String stopBreak() {
        return "Kia 차량이 멈춰섭니다.";
    }
}
