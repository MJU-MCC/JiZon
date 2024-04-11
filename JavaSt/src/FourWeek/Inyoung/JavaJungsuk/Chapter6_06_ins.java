package FourWeek.Inyoung.JavaJungsuk;

public class Chapter6_06_ins {
    public static void main(String[] args) {
        Tv t; //참조변수
        t = new Tv(); //멤버변수는 각 자료형에 해당하는 기본값으로 초기화됨
        t.channel = 7; //참조변수.멤버변수
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + "입니다.");
    }
}

class Tv {
    String color;
    boolean power;
    int channel;

    void power(){
        power = !power;
    }

    void channelUp(){
        ++channel;
    }

    void channelDown(){
        --channel;
    }
}
