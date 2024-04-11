package SixWeek.yhs;

public class Emergency extends Tteokbokki {
    Emergency(int spicy, int quantity){
        super(spicy, quantity);
    }
    public void option(){
        System.out.print("1.치즈 2.수제비 3.추가x");
        super.option();
    }
    public void print(){
        System.out.print("응급실 떡볶이 ");
        super.print();
    }
}
