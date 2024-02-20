package TwoWeek.HyunSeong;

public class Duzzim implements Restaurant{

    @Override
    public int takeBob(int price) {
        int changeMoney = price - GonggiBob;
        System.out.println("두찜 식당이 손님에게 " + price + "를 받아서" + changeMoney + "를 거슬러 주었습니다");
        return changeMoney;
    }

    @Override
    public String toString() {
        return "두찜";
    }
}
