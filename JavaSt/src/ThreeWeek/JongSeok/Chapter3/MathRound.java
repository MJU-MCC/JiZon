package ThreeWeek.JongSeok.Chapter3;

public class MathRound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double A = 56.223132;
		double B = Math.round(A * 100) / 1000.0;
		System.out.println(B);
		/*Math.round(5622.3132) / 1000. 0
		-> 5622 / 1000.0
		-> 5.622*/
		long C =  Math.round(A * 100) / 1000;
		System.out.println(C);
	}

}
