package TwoWeek.Jiwon;

public class 펭귄 extends 조류 implements 물생활{
    @Override
    void eat() {
        System.out.println("생선을 먹는다.");
    }

    @Override
    void sound() {
        System.out.println("펭귄 소리를 낸다.");

    }

    @Override
    void live() {
        System.out.println("얼음과 물에서 산다.");

    }

    @Override
    void 조류특징() {
        System.out.println("알을 낳는다.");

    }

    @Override
    public void waterlove() {
        System.out.println("물을 사랑하는 펭귄");
    }
}
