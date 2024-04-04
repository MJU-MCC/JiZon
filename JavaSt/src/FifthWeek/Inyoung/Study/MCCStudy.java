package FifthWeek.Inyoung.Study;

public abstract class MCCStudy {

    protected static String Chairman = "Kim";
    protected static int Member = 46;
    protected String Study;
    protected int StudyMember;

    public MCCStudy(String Chairman, int Member, String Study, int StudyMember){
        this.Chairman = Chairman;
        this.Member = Member;
        this.Study = Study;
        this.StudyMember = StudyMember;
    }

    public abstract String introduce();

    public abstract String thisweek();

    public abstract String lastweek();
}
