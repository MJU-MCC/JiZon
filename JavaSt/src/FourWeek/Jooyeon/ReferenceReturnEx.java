package FourWeek.Jooyeon;

class Data {
    int x;
}
//정적(static) 클래스 내에서는 클래스 메서드(class method)만 직접 호출할 수 있다.

public class ReferenceReturnEx {
    public static void main(String[] args) {

        ReferenceReturnEx R = new ReferenceReturnEx(); //R 객체를 만들고 null로 초기화


        Data d = new Data();
        d.x = 10;
        System.out.println("d.x = " + d.x);


        Data d2 = R.copy(d);

        System.out.println("d2.x = " + d2.x);


    }

    Data copy(Data d) {
        Data tmp = new Data();
        tmp = d;
        tmp.x = 20;

        return tmp;
    }


}
