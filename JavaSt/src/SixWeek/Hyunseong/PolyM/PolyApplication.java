package SixWeek.Hyunseong.PolyM;

import java.util.*;

public class PolyApplication {
    static List<Human> studentList = new ArrayList<Human>();

    public static void main(String args[]){
        Student kim = new DaesungStudent("김갑자");
        Student choi = new DaesungStudent("최말숙");
        Student ho = new DaesungStudent("호식이");
        Student yoon = new DaesungStudent("윤숙희");
        Student lee = new DaesungStudent("이미자");
        List<Human> resultStudents = inputStudentList(kim, choi, ho, yoon, lee);

        Teacher mathTeacher1 = new DaeSungTeacher("나수학");
        mathTeacher1.teaching(resultStudents);

    }

    static private List<Human> inputStudentList(Student... st){
        for(Human s : st){
            studentList.add(s);
        }
        return studentList;
    }

}
