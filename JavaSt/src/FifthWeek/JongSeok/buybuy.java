package FifthWeek.JongSeok;

class Product{
    int price;
    int bonuspoint;

    Product(int price){
        this.price = price;
        bonuspoint = (int)(price/10.0);
    }
}
class Tv extends Product{
    Tv() {
        super(150); //조상 Product클래스의 생성자 호출
    }

    public String toString(){ return "Tv"; }
}
class Computer extends Product{
    Computer(){
        super(250); //조상 Product클래스의 생성자 호출
    }
    public String toString(){ return "Computer"; }
}
class Buyer {
    int money = 1000;
    int bonuspoint = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p.price;
        bonuspoint += p.bonuspoint;
        if (p.toString().equals("Tv")) {
            System.out.println(p + "를 구매 하셨습니다.");
        }else {
                System.out.println(p + "을 구매 하셨습니다.");
            }
        }
    }


public class buybuy {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("잔액 : " + b.money + "만원");
        System.out.println("보너스점수 : " + b.bonuspoint + "point");
    }
}
