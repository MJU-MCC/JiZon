package TwelveWeek.juyoung;
import java.util.List;

public class Kimbap extends Bunsik {
    private List<String> ingredients;

    //생성자
    public Kimbap(int price, List<String> ingredients) {
        super("김밥", price);
        this.ingredients = ingredients;
    }

    
    @Override
    public String cook() {
        return name + "을(를) 요리합니다. 재료: " + String.join(", ", ingredients);
    }
}
