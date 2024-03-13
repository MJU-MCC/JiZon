package TwoWeek.Hyunseon;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if('a'<=c && c <='z'){
            System.out.println("입력값이 소문자입니다. ");
        }else if('A' <= c && c <='Z'){
            System.out.println("입력값이 대문자입니다. ");
        }else{
            System.out.println("입력값이 영문이 아닙니다. ");
        }
    }
}
