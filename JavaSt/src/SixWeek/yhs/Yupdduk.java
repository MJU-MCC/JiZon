package SixWeek.yhs;

import java.util.Scanner;

public class Yupdduk extends Tteokbokki{
    Yupdduk(int spicy, int quantity){
        super(spicy, quantity);
    }
    public void option(){
        System.out.print("1.중국당면 2.주먹밥 3.추가x : ");
        super.option();
    }
    public void print(){
        System.out.print("엽기 떡볶이 ");
        super.print();
    }
}
