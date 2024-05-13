package NineWeek.Juyoung;

import java.util.Scanner;
import java.util.Stack;

public class baekjoon10828 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();   // 정수를 저장할 Stack 객체 생성
        StringBuilder sb = new StringBuilder(); // 결과를 저장할 StringBuilder 객체 생성

        int N = sc.nextInt(); // 명령의 개수 입력 받음
        
        for(int i = 0; i < N; i++) {
            String command = sc.next(); // 명령어 입력 받음
            
            switch(command) {

                //push X: 정수 X를 스택에 넣는 연산이다.
                case "push":
                    int number = sc.nextInt(); // push 다음에 오는 수 입력 받음
                    stack.push(number);
                    break;

                //pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                case "pop":
                    if(stack.isEmpty()) {
                        sb.append(-1).append('\n'); // 결과를 sb에 추가
                    } else {
                        sb.append(stack.pop()).append('\n'); // 결과를 sb에 추가
                    }
                    break;

                //size: 스택에 들어있는 정수의 개수를 출력한다.
                case "size":
                sb.append(stack.size()).append('\n'); // 스택의 크기를 sb에 추가
                break;

                //empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
                case "empty":
                    // 스택이 비어있는지 확인
                    if(stack.isEmpty()) {
                        // 스택이 비어있다면 1을 결과 문자열에 추가
                        sb.append(1).append('\n');
                    } else {
                        // 스택이 비어있지 않다면 0을 결과 문자열에 추가
                        sb.append(0).append('\n');
                    }   // 스택이 비어있는지 확인하여 결과를 SB에 추가
                    break;

                //top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                case "top":
                    if(stack.isEmpty()) {
                        sb.append(-1).append('\n'); // 결과를 SB에 추가
                    } else {
                        sb.append(stack.peek()).append('\n'); // 결과를 sb에 추가
                    }
                    break;    
            }
        }
        
        System.out.println(sb.toString()); // 모든 명령 처리 후 결과를 한 번에 출력
    }
}

//시간 너무 오래 걸림 ㅠ 최적화할 필요 있을 듯
