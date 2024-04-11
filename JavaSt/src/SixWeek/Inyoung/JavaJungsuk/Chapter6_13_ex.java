package SixWeek.Inyoung.JavaJungsuk;

public class Chapter6_13_ex {
    public static void main(String[] args) {
        System.out.println("Card. width = " + Card.width);
        //클래스 변수(static 변수)는 객체생성없이 클래스 이름.

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";  //인스턴스 변수의 값 변경
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        c1.width = 50;  //클래스 변수의 값 변경
        c1.height = 80;
        //웬만하면 클래스변수를 사용할 땐 Card.width와 Card.height로 쓸 것


        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
    }
}

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}
