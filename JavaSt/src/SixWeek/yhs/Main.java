package SixWeek.yhs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--메뉴--");
        System.out.println("1. 엽떡");
        System.out.println("2. 신전");
        System.out.println("3. 응떡");
        System.out.println("맵기 : 1-5단계");
        System.out.println("인분 : 1-4인분");
        System.out.print("순서대로 입력해주세요 : ");

        int menu = sc.nextInt();
        int spicy = sc.nextInt();
        int quantity = sc.nextInt();

        if(menu == 1){
            Yupdduk yup = new Yupdduk(spicy, quantity);
            yup.option();
            yup.print();
        }else if(menu==2){
            Temple tem = new Temple(spicy, quantity);
            tem.option();
            tem.print();
        }else if(menu == 3){
            Emergency emer = new Emergency(spicy, quantity);
            emer.option();
            emer.print();
        }else{
            System.out.println("다시 입력해주세요.");
        }
    }
}
