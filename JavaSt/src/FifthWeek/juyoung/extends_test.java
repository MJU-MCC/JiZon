package FifthWeek.juyoung;

class Tv {
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUP() { ++channel; }
    void channelDOWN() { --channel; }
}

class SmartTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

public class extends_test {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channelUP(); //채널 1증가(현재 채널 11)
        System.out.println(stv.channel);
        stv.displayCaption("Hello, World");  //처음엔 False로 되어 있어서 displaycaption을 실행시키지 않는다
        stv.caption = true; //자막 기능을 켠다
        stv.displayCaption("Hello, World");  //
    }
}
