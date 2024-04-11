package SixWeek.Hyunseong.PolyM;

public class DaesungStudent extends Human implements Student{

    public DaesungStudent(String inputName) {
        super(inputName);
    }

    @Override
    public void takeRest() {
        System.out.println("대성 학원 "+this.name +"은 5분 동안 쉬는 시간을 갖습니다.");
    }

    @Override
    public void teached(Human t) {
        System.out.println("대성 학원 학생 "+this.name +"이는 "+ t.getHumanName()+ " 선생님에게 수업을 받습니다.");
    }
}
