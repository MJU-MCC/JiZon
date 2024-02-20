package TwoWeek.Inyoung;

public class Starbucks extends Setting{

    public Starbucks(String menu, int price, int number) {
        super(menu, price, number);
    }

    @Override
    public String ment(){
        return "안녕하세요~! 스타벅스입니다.";
    }

    @Override
    public String priceMent(){
        return this.menu + "는 " + this.price + "원 입니다.";
    }

    @Override
    public String order(){
        return this.menu + " " + this.number + "잔 준비해드리겠습니다.";
    }
}
