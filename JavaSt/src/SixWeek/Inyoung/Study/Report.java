package SixWeek.Inyoung.Study;

import java.util.Scanner;

public class Report {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 회장이 바뀔 경우 : MCCStudy.Chairman = "LEE";
        System.out.println("안녕하세요 저희는 동아리 MCC입니다. 회장은 " + MCCStudy.Chairman + "입니다.");
        // 누군가 한 명이 3OUT 제도에 걸렸다고 가정
        MCCStudy.Member = MCCStudy.Member -1;
        System.out.println("동아리원은 현재 " + MCCStudy.Member + "명 입니다.");
        System.out.println();

        CStudy Cfirstweek = new CStudy("C언어 2팀", 6);
        System.out.println(Cfirstweek.introduce());
        System.out.println("CStudy 이번 주 활동 내용: " + Cfirstweek.thisweek());
        System.out.println("CStudy 다음 주 활동 계획: " + Cfirstweek.nextweek());
        System.out.println();

        JavaStudy Jfirstweek = new JavaStudy("자바 0팀", 7);
        System.out.println(Jfirstweek.introduce());
        System.out.println("JavaStudy 이번 주 활동 내용: " + Jfirstweek.thisweek());
        System.out.println("JavaStudy 다음 주 활동 계획: " + Jfirstweek.nextweek());

        scanner.close();
    }
}

