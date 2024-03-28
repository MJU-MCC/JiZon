package ThreeWeek.JongSeok.Chapter3;

public class Ex3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1_000_000;
		int b = 2_000_000;
		long c = a * b;
		System.out.println(c);
		
		c = 1000000L * 2000000;
		System.out.println(c);
	
		long d;
		d = (long)a * b;
		System.out.println(d);
		//리터럴 접미사 써야하겠다
	}

}
