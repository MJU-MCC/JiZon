package EightWeek.Jongseok;

import java.util.*;

public class Match_number {
    public static void main(String[] args) {
        int target = (int)(Math.random() * 100) + 1; //정답 정수
        int input = 0; //입력 정수
        int count = 0; //시도횟수

        do{
            count++;
            System.out.print("1~100사이 정수 입력 :");
            try {
                input = new Scanner(System.in).nextInt(); //a.정수가 아닌것을 입력시 자동으로 예외발생
                if (input < 1 || input > 100){ //b.입력값의 범위가 1~100을 벗어났을때 예외 발생
                    throw new IllegalArgumentException();
                }
            } catch (InputMismatchException i){ //a.정수가 아닐때
                System.out.print("정수가 아닙니다, ");
                continue;
            } catch (IllegalArgumentException a){ //b.범위를 벗어날을 경우 예외처리
                System.out.print("범위를 벗어난 정수가 입력되었습니다, ");
                continue;
            }
            if(target > input){
                System.out.println("입력 : " + input + ", 더 큰수를 입력");
            } else if (target < input) {
                System.out.println("입력 : " + input + ", 더 작은수를 입력");
            } else {
                System.out.println("정답 : " + target);
                System.out.println("시도회수 :"+ count + "회");
                break;
            }
        }while (true);
    }
}
