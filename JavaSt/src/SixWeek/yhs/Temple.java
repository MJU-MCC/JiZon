package SixWeek.yhs;

public class Temple extends Tteokbokki{
    Temple(int spicy, int quantity){
        super(spicy, quantity);
    }
    public void option(){
        System.out.print("1.치즈 2.오뎅튀김 3.추가x");
        super.option();
    }
    public void print(){
        System.out.print("신전 떡볶이");
        super.print();
    }
}
