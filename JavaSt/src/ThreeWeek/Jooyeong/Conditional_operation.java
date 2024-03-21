package ThreeWeek.Jooyeong;

public class Conditional_operation {
    
    public static void main(String[] args) {

        //17. 조건 연산자
        int x = 5;
        int y = 7;

        int result = (x>y) ? x : y; //1번방법

        System.out.println("1번방법 결과값: " + result);
        //2번방법
        if(x>y)
            result = x;
        else
            result = y;

        System.out.println("2번방법 결과값: " + result);

    }
}
