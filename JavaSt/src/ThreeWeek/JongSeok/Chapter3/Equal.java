package ThreeWeek.JongSeok.Chapter3;

public class Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("abc");
		String ing = "qwe";
		
		boolean result1 = str.equals("abc");
		boolean result2 = str.equals("qwe");
		boolean result3 = ing.equals("qwe");
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		/*String에 new는 생략해도 됨
		 사용하는 경우는 
		 1) 문자열의 리터럴의 내용을 동적으로 결정할때
			-> 입력받아서 할당할때
		 
		 2)문자열이 메소드나 루프내에서 계속 변경 될때
		 	-> 
		 	String result = "";
				for (int i = 0; i < 10; i++) {
    				result += i; //문자열을 계속해서 변경하는 경우
			}
		 
		 */

	}

}