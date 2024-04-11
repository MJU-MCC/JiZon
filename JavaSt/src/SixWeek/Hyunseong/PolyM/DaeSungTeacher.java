package SixWeek.Hyunseong.PolyM;

import java.util.*;

public class DaeSungTeacher extends Human implements Teacher{
    public DaeSungTeacher(String inputName) {
        super(inputName);
    }

    @Override
    public void takeRest() {
        System.out.println("세종 학원 "+this.name+" 선생님도 5분 동안 쉬는 시간을 갖습니다.");
    }

    @Override
    public void teaching(List<Human> students) {
        System.out.print("대성 학원  "+this.name +" 선생님은 "+students.forEach(
                Human::getHumanName
        );

        System.out.print(" 아이들을 가르칩니다."+"\n");
    }

}
