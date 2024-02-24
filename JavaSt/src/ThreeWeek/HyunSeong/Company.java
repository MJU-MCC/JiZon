package ThreeWeek.HyunSeong;

public abstract class Company {
    public String plusAnotherDefaultMethod(){
        return "추상클래스에서도 메서드 구현이 가능한데 인터페이스에 있는 Default와 무슨 차이가 있을까?" +
                "인터페이스는 다중 상속이 가능하나 , 추상 클래스는 단일 상속만 가능하다.";
    }

}
