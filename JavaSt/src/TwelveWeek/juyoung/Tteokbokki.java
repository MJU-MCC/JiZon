package TwelveWeek.juyoung;

public class Tteokbokki extends Bunsik {
    private String spicyLevel;

    //생성자
    public Tteokbokki(int price, String spicyLevel) {
        super("떡볶이", price);
        this.spicyLevel = spicyLevel;
    }

    
    @Override
    public String cook() {
        return name + "를 요리합니다. 매운맛: " + spicyLevel;
    }
}