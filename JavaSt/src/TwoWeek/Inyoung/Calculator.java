package TwoWeek.Inyoung;

public class Calculator {
    public void setSt(Setting st) {
        this.st = st;
    }

    private Setting st;
    private int sumMoney;

    public int calc(){
        int result = st.price * st.number;
        sumMoney += result;
        return result;
    }

    public void sumInfo(){
        System.out.println("손님이 주문하신 음료의 총 금액은 " + sumMoney);
    }

    public void savePoint(){
        int point = sumMoney / 10;
        System.out.println("주문하신 금액은 " + sumMoney + " 이고 적립되는 포인트는 " + point + "입니다.");
    }
}
