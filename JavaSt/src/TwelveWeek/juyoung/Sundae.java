package TwelveWeek.juyoung;

public class Sundae extends Bunsik {
    private String size;

    //생성자
    public Sundae(int price, String size) {
        super("순대", price);
        this.size = size;
    }

    
    @Override
    public String cook() {
        return name + "를 요리합니다. 크기: " + size;
    }
}

