package ThreeWeek.Jooyeong;

public class casting {
    public static void main(String[] args) {

        //07. 형변환 연산자 


        //double -> int
        double d = 85.4;
        int score = (int) d;
        System.out.println("score = " + score);
        System.out.println("d = " + d);         //casting 후에도 변화 없음


        //float -> int
        float a = 1.6f;                     //f는 flaoat타입을 명시하는 것
        int result = (int)a;                // casting
        System.out.println("result = " + result); //반올림이 아닌 소수점 앞 자리가 사라짐
        System.out.println("a = " + a);       //casting 후에도 변화 없음


    }
}
