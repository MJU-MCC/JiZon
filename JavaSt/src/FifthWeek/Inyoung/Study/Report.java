package FifthWeek.Inyoung.Study;

public class Report {
    public static void main(String[] args) {
        MCCStudy.Chairman = "LEE";
        System.out.println("안녕하세요 저희는 동아리 MCC입니다. 회장은 " + MCCStudy.Chairman + "입니다.");
        System.out.println("동아리원은 현재 " + MCCStudy.Member + "명 입니다.");

        CStudy Cfirstweek = new CStudy("C언어 2팀", 6);
        System.out.println(Cfirstweek.introduce());
        System.out.println(Cfirstweek.thisweek());
        System.out.println(Cfirstweek.lastweek());

        JavaStudy Jfirstweek = new JavaStudy("자바 0팀", 7);
        System.out.println(Jfirstweek.introduce());
        System.out.println(Jfirstweek.thisweek());
        System.out.println(Jfirstweek.lastweek());

    }
}
