package TwoWeek.Inyoung;


public class Customer {

    protected String name;
    protected int point;

    public Customer(String name, int point){
        this.name = name;
        this.point = point;
    }

    public String showInfo(){
        return this.name + "고객님, " + this.point + "포인트 적립되었습니다. 감사합니다.";
    }

}
