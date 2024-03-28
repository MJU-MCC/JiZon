package FourWeek.Inyoung.JavaJungsuk;

public class Chapter5_08_Ex {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int i = 0; i < score.length; i++) {
            sum += score[i]; //반복문을 이용해서 배열에 저장되어 있는 값들을 모두 더함
        }
        average = sum / (float)score.length; //계산 결과를 float으로 얻으려 형변환

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average);
    }
}
