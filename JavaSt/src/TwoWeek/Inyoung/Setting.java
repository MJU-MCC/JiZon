package TwoWeek.Inyoung;

public abstract class Setting {
    protected String menu;
    protected int price;
    protected int number;

    public Setting(String menu, int price, int number){
        this.menu = menu;
        this.price = price;
        this.number = number;
    }

    public abstract String ment();

    public abstract String priceMent();

    public abstract String order();

}
