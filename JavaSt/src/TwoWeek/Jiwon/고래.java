package TwoWeek.Jiwon;

public class 고래 extends 포유류 implements 물생활 {

    @Override
    void eat() {
        System.out.println("물고기를 먹는다.");
    }

    @Override
    void sound() {
        System.out.println("고래소리를 낸다.");

    }

    @Override
    void live() {
        System.out.println("물에 산다.");

    }

    @Override
    void 포유류특징() {
        System.out.println("새끼를 낳는다.");

    }

    @Override
    public void waterlove() {
        System.out.println("물을 사랑하는 고래");
    }
}
