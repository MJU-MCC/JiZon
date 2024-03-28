package ThreeWeek.JongSeok.Chapter3;

import java.util.Scanner;

public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("문자를 하나 압력하세요?"); 
		
		String input = scanner.nextLine(); // 숫자, 영문자 둘다 입력 받기위해서
		ch = input.charAt(0); //문자열을 문자로
		
		if('0' <= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}
		
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("입력하신 문자는 영문자입니다.%n");
		}
	}

}