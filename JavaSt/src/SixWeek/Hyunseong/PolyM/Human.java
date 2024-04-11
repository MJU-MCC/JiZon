package SixWeek.Hyunseong.PolyM;

public abstract class Human {
    String name;
    public abstract void takeRest();

    public String getHumanName(){
        return this.name;
    }

    //학원을 등록할때 , 학생이든 선생님이든 이름을 받아서 등록 할 수 있도록 설계하였습니다.
    public Human(String inputName){
        this.name = inputName;
    }

}
