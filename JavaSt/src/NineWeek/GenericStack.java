package NineWeek;

import java.util.ArrayList;


// 지네릭스

//다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에 컴파일 시의 타입 체크를 해주는 기능
//다룰 객체의 타입을 미리 명시해줌으로써 번거로운 형변환을 줄여줌
public class GenericStack<T> { 
    // GenericStack<T>는 제네릭을 사용하여 구현된 스택(Stack) 클래스
    // 여기서 <T>는 제네릭 타입 매개변수. 이를 통해 해당 클래스는 어떤 타입의 요소도 저장 가능

    private ArrayList<T> stack; //제네릭을 사용한 필드 선언

    // 스택은 후입선출 구조

    // 생성자: 스택을 초기화
    public GenericStack() {
        stack = new ArrayList<>();
    }

    // 요소를 스택에 추가
    public void push(T item) {
        stack.add(item);
    }

    // 스택에서 요소를 제거하고 반환
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("스택이 비어 있습니다.");
        }
        return stack.remove(stack.size() - 1);
    }

    // 스택의 가장 위에 있는 요소를 반환
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("스택이 비어 있습니다.");
        }
        return stack.get(stack.size() - 1);
    }

    // 스택이 비어 있는지 확인
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // 스택의 크기를 반환
    public int size() {
        return stack.size();
    }

    // main 메서드: 제네릭 스택을 테스트
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>(); // Integer 타입의 스택 생성
        intStack.push(10); // 요소 추가
        intStack.push(20);
        intStack.push(30);

        System.out.println("스택의 크기: " + intStack.size()); // 스택의 크기 출력
        System.out.println("가장 위의 요소: " + intStack.peek()); // 가장 위의 요소 출력
        System.out.println("pop된 요소: " + intStack.pop()); // 요소를 제거하고 반환
        System.out.println("스택의 크기: " + intStack.size()); // 스택의 크기 출력
    }
}
