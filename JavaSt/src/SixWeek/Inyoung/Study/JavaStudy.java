package SixWeek.Inyoung.Study;

import java.util.Scanner;

public class JavaStudy extends MCCStudy {

    public JavaStudy(String Study, int StudyMember){
        super(Study, StudyMember);
    }

    @Override
    public String thisweek() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이번 주의 활동 내용을 입력하세요:");
        String activity = scanner.nextLine();
        return activity;
    }

    @Override
    public String nextweek(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("다음주의 활동 계획을 입력하세요:");
        String activity = scanner.nextLine();
        return activity;
    }
}

