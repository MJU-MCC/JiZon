package NineWeek;


import java.util.ArrayList;

//컬렉션 프레임워크 중 ArrayList

/*
컬렉션 프레임워크(Collection Framework)는 Java에서 데이터 그룹을 다루는 데 사용되는 클래스들의 집합체.
데이터를 저장, 검색, 수정 및 삭제할 수 있는 공통 인터페이스와 알고리즘을 제공
 */

public class ArrayListExample {
    public static void main(String[] args) {

        // ArrayList 생성
        ArrayList<String> names = new ArrayList<>();

        // 요소 추가
        names.add("엄마곰");  // "엄마곰"을 리스트에 추가
        names.add("아빠곰");    // "아빠곰"을 리스트에 추가
        names.add("아기곰");// "아기곰"을 리스트에 추가

        // 요소 접근
        System.out.println("첫 번째 요소: " + names.get(0));  // 첫 번째 요소 출력
        System.out.println("두 번째 요소: " + names.get(1));  // 두 번째 요소 출력
        System.out.println("세 번째 요소: " + names.get(2));  // 세 번째 요소 출력

        // 요소 수정
        names.set(1, "아빠상어");  // 두 번째 요소를 "아빠상어"로 수정

        // 요소 삭제
        names.remove(2);  // 세 번째 요소 삭제

        // 모든 요소 출력
        System.out.println("모든 요소:");
        for (String name : names) {  // 리스트의 모든 요소를 출력
            System.out.println(name);
        }

        // ArrayList 크기 출력
        System.out.println("ArrayList 크기: " + names.size());  // 리스트의 크기 출력
    }
}
