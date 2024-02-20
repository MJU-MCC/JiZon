package TwoWeek.HyunSeong;

public class Person {
    private Restaurant restaurant;
    private int wallet;

    public Person(Restaurant restaurant, int wallet) {
        this.restaurant = restaurant;
        this.wallet = wallet;
    }
    public String order(){
        return restaurant+" 식당에게 주문을 넣었습니다.";
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

}
