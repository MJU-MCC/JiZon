package ElevenWeek.Jongseok;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Lotto2 {

    public static void main(String[] args) {
        List<Integer> lottoNumbers = LottoNumbers();

        // 로또 번호 출력
        System.out.println("로또 번호: " + lottoNumbers);
    }

    private static List<Integer> LottoNumbers() {

        // 1부터 45까지의 숫자를 스트림으로 생성한 후 섞고 6개 선택
        return IntStream.rangeClosed(1, 45)
                .boxed() // IntStream을 Stream<Integer>로 변환
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(), //1. 스트림을 리스트로 변환
                        collected -> { //2.수집된 리스트에 대해 처리
                            java.util.Collections.shuffle(collected, new Random()); // 3. 리스트를 섞음
                            return collected.stream(); // 섞인 리스트를 다시 스트림으로 변환하여 반환
                        }
                ))

                .limit(6) // 6개 선택
                .sorted()
                .collect(Collectors.toList()); // 리스트로 변환
    }
}

