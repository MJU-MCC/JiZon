package FourWeek.JongSeok.Chapter6;
class Data {int x;}

public class Parameter {
    public static void main(String[] args) {
        //매개변수가 기본형일때와 참조형일때의 차이
        Data p = new Data();
        p.x = 10;
        System.out.println("main() : x = " + p.x);

        change1(p.x); // x에 p.x = 10을 받아옴
        System.out.println("기본형 매개변수");
        System.out.println("change1() : x = " + p.x); //p.x가 변경 된게 아닌 change1() 안의 x값이 변경
        System.out.println();
        change2(p);
        System.out.println("참조형 매개변수");
        System.out.println("change2() : x = " + p.x);

    }

    static void change1(int x){
        x = 10000;
        System.out.println("change1() : x = " + x);
    }

    static void change2(Data d){
        d.x = 200;
        System.out.println("change2() : x = " + d.x);
    }
}
