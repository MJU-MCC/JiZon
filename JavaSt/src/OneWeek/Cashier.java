package OneWeek;

public class Cashier {
    private int price;

    private String menu;




    public int getPrice() {
        return price;
    }



    public void setPrice(int price) {
        this.price = price;
    }

    public int changeMoney(int money){
        return money-this.price;
    }
    public String greeting(){
        return "어서오세요~! 카페입니다.";
    }
}
