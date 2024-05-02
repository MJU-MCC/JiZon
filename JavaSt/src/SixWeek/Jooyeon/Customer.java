package SixWeek.Jooyeon; // SixWeek 패키지의 Jooyeon 서브패키지에 속하는 클래스를 정의

// 고객 클래스
class Customer {
    private String name; // 고객의 이름을 저장하는 변수

    // 생성자: 고객의 이름을 매개변수로 받아 초기화
    public Customer(String name) {
        this.name = name; // 받은 이름을 클래스의 name 변수에 저장
    }

    // 이름을 반환하는 메소드
    public String getName() {
        return name; // name 변수의 값을 반환
    }
}
