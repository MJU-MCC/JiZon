package ElevenWeek.Jongseok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Lotto1 {

    public static void main(String[] args) {
        // 로또 번호 범위 생성
        List<Integer> lottoNumbers = new ArrayList<>();
       for (int i = 1; i < 45; i++){
           lottoNumbers.add(i);
       }
       Collections.shuffle(lottoNumbers, new Random());

       //로또 번후 섞고 6개 선택하여 저장
       List<Integer> Lotto = lottoNumbers.subList(0,6);
       Collections.sort(Lotto);
        // 로또 번호 출력
        System.out.println("로또 번호 : " + Lotto);





    }
}

