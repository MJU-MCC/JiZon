package SixWeek.yhs;

import java.util.Scanner;

public class Tteokbokki {
    int spicy;
    int quantity;
    int option;

    Tteokbokki(int spicy, int quantity){
        this.spicy = spicy;
        this.quantity = quantity;
    }

    public void option(){
        Scanner sc = new Scanner(System.in);
        this.option = sc.nextInt();
    }

    public void print(){
        System.out.println(spicy+"단계, "+quantity+"인분, 옵션 : "+option+"가 주문 완료되었습니다.");
    }
}
