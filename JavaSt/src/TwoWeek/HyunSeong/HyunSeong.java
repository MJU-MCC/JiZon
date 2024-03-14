package TwoWeek.HyunSeong;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HyunSeong {
    public static void main(String[] args) {
//        //두찜 식당 객체 생성
//        Duzzim duzzim = new Duzzim();
//
//        //두찜 식사를 원하는 현성 손님 생성
//        Person hs = new Person(duzzim, 10000);
//
//        //손님이 주문하기
//        System.out.println(hs.order());
//
//        duzzim.takeBob(10000);
//
//        System.out.println("Restaurant 의 공깃밥 가격 필드 직접 꺼내기 = "+Restaurant.GonggiBob);

        String arr[] = new String[]{"abc", "def", "hij", "kef"};
        Stream<String> stream = Arrays.stream(arr);
        System.out.println("stream = " + stream.collect(Collectors.toList()));
        System.out.println("stream.iterator = " + stream.iterator());
    }
}
