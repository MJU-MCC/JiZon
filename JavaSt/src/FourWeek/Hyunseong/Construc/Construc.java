package FourWeek.Hyunseong.Construc;

public class Construc {

    public static void main(String args[]){
        Hamburger mac = new Hamburger("맥도날드");
        System.out.println(mac.printInfoHamburger());
        Hamburger king = new Hamburger("버거킹");
        System.out.println(king.printInfoHamburger());
    }

}
