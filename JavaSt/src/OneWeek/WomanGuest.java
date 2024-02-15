package OneWeek;

public class WomanGuest implements Guest{

    private String name ;
    @Override
    public void greeting() {
        System.out.println("안녕하세요 여자인 저의 이름은 " + this.name + "입니다.");
    }

    @Override
    public String order(String menu,int number) {
        System.out.println(menu + "로 "+number+"개 주세요");
        return menu;
    }


    @Override
    public void pickUpDrink(String Drink) {
        System.out.println(Drink + "알아서 마시겠습니다. 감사합니다.");
    }

    public WomanGuest(String name) {
        this.name = name;
    }
}
