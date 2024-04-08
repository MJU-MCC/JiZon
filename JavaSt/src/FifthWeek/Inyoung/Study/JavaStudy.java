package FifthWeek.Inyoung.Study;

public class JavaStudy extends MCCStudy{

    public JavaStudy(String Study, int StudyMember){
        super(Chairman, Member, Study, StudyMember);
    }

    @Override
    public String introduce() {
        return "안녕하세요 저희는 " + this.Study + "입니다.\n" + "참석자 수는 " + this.StudyMember + "입니다.";
    }

    @Override
    public String thisweek() {
        return "이번주는 모두 참석했고 다음주에 객체를 이어서 배울 예정입니다.";
    }

    @Override
    public String lastweek(){
        return "지난주에도 모두가 참석했으며 배열에 대해 공부했습니다.";
    }
}
