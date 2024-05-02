package SixWeek.Inyoung.Study;

public abstract class MCCStudy {

    protected static String Chairman = "Kim";
    protected static int Member = 46;
    protected String Study;
    protected int StudyMember;

    public MCCStudy(String Study, int StudyMember){
//        this.Chairman = Chairman;
//        this.Member = Member;
        this.Study = Study;
        this.StudyMember = StudyMember;
    }

    public String introduce() {
        return "안녕하세요 저희는 " + this.Study + "입니다.\n" + "참석자 수는 " + this.StudyMember + "입니다.";
    }

    public abstract String thisweek();

    public abstract String nextweek();
}
