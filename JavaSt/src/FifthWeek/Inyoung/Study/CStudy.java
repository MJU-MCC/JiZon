package FifthWeek.Inyoung.Study;

public class CStudy extends MCCStudy {

    public CStudy(String Study, int StudyMember){
        super(Chairman, Member, Study, StudyMember);
    }

    @Override
    public String introduce() {
        return "안녕하세요 저희는 " + this.Study + "입니다.\n" + "참석자 수는 " + this.StudyMember + "입니다.";
    }

    @Override
    public String thisweek() {
        return "이번주는 한 명 결석했고 다음주에 반복문을 공부할 예정입니다.";
    }

    @Override
    public String lastweek(){
        return "지난주는 모두가 참석했으며 조건문에 대해 공부했습니다.";
    }
}
