package FourWeek.Hyunseong.Construc;

public class Hamburger {
    private String name;
    private int count;

    public Hamburger(String inputName){
        this.name = inputName;
        count ++;
    }
    public String printInfoHamburger(){
        return name + "의 이름이고 , 현재까지 버거의 총 주문량은 = "+ count+"입니다.";
    }
}
