package FourWeek.JongSeok.Chapter5;

import ThreeWeek.HyunSeon.MathRandom;

public class Ex5_5 {
    public static void main(String[] args) {
        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];


        // ballArr의 임의의 요소를 골라서 위치 교환
        for(int i=0; i<ballArr.length; i++){
            int j = (int)(Math.random() * ballArr.length); // Math.random()은 0.0이상 1미만의 double값 반환
            int tmp = 0;

            tmp = ballArr[0];
            ballArr[0] = ballArr[j];
            ballArr[j] = tmp;
        }

        // ballArr의 앞에서 3개의 수를 ball3로 복사
        for(int i=0; i<ball3.length; i++){
            ball3[i] = ballArr[i];
        }



        for(int i=0; i<ball3.length; i++){
            System.out.print(ball3[i]);
        }
    }
}
