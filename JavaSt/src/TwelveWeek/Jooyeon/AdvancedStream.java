package TwelveWeek.Jooyeon;
import java.util.ArrayList; // ArrayList 사용을 위한 임포트
import java.util.List; // List 인터페이스 사용을 위한 임포트
import java.util.Map; // Map 인터페이스 사용을 위한 임포트
import java.util.Comparator; // 객체 비교를 위한 Comparator 인터페이스 사용을 위한 임포트
import java.util.stream.Collectors; // 스트림 결과를 다양한 형식으로 수집하기 위한 Collectors 클래스 사용을 위한 임포트

public class AdvancedStream {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 29, "인사부", 93000000));
        employees.add(new Employee("Bob", 34, "인사부", 88000000));
        employees.add(new Employee("Charlie", 45, "엔지니어링", 105000000));
        employees.add(new Employee("David", 28, "엔지니어링", 99000000));
        employees.add(new Employee("Edward", 38, "마케팅", 76000000));
        employees.add(new Employee("Frank", 31, "마케팅", 58000000));

// 필터링: 30세 이상 직원만 선택

        // 리스트로부터 스트림을 생성
        List<Employee> filteredEmployees = employees.stream()

                //스트림의 각 요소 e에 대해 나이가 30 이상인지 평가
                // 이 조건을 만족하는 요소만 다음 단계로 넘어간다
                .filter(e -> e.getAge() >= 30)

                // 필터링된 스트림의 요소들을 새로운 List에 수집한다
                // 이는 최종 연산으로, 필터링된 결과를 리스트로 반환한다
                .collect(Collectors.toList());

        // 부서별 평균 연봉 계산을 위한 코드
        // 스트림 API를 사용하여 직원 리스트를 처리
        Map<String, Double> averageSalaryByDept = filteredEmployees.stream()
                // 스트림에서 각 직원을 그들의 부서별로 그룹화
                .collect(Collectors.groupingBy(
                        Employee::getDepartment, // Employee 객체에서 부서를 반환하는 메서드 참조
                        // 각 부서별로 직원의 연봉 평균을 계산
                        Collectors.averagingDouble(Employee::getSalary) // 연봉을 추출하여 평균을 계산
                ));

        ㅎ// 부서별 최고 연봉자를 찾기 위한 코드
        Map<String, Employee> highestPaidByDept = filteredEmployees.stream()
                // 스트림의 각 요소를 부서별로 그룹화
                .collect(Collectors.groupingBy(
                        Employee::getDepartment, // 부서 이름을 추출하는 함수
                        // 그룹화된 결과에 추가적인 처리를 적용
                        Collectors.collectingAndThen(
                                // 각 부서별로 연봉이 가장 높은 직원 찾기
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), // 연봉을 기준으로 최대값 비교
                                // Optional 객체에서 결과를 추출
                                Optional -> Optional.get() // 최대값을 추출, Optional이 비어있지 않다고 가정
                        )
                ));


        // 결과 출력
        averageSalaryByDept.forEach((dept, avgSalary) -> System.out.println(dept + " 평균 연봉: " + String.format("%,.0f원", avgSalary)));
        highestPaidByDept.forEach((dept, emp) -> System.out.println(dept + " 가장 많은 급여를 받는: " + emp.getName() + " (" + String.format("%,.0f원", emp.getSalary()) + ")"));
    }
}
