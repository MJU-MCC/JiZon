package ThreeWeek.Jooyeong;

public class Mathround {
    
    public static void main(String[] args) {
        
        //11. Math.round()로 반올림하기
        
        double pi = 3.141592;

        //Math.round(3141.592) / 1000.0
        //3142 / 1000.0
        double shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortPi);
    }

}
