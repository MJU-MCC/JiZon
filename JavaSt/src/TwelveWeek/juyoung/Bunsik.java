package TwelveWeek.juyoung;

abstract class Bunsik {
    protected String name;  // 분식이름
    protected int price;    // 분식가격

    //생성자
    public Bunsik(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 추상 메소드
    public abstract String cook();

    //분식 이름과 가격 리턴
    @Override   //java.lang.Object 에서 상속받음    
    public String toString() {
        return name + ": " + price + "원";
    }
}