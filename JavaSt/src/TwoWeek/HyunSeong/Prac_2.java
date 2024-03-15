package TwoWeek.HyunSeong;

public class Prac_2 {
    int a;
    String b;
    char c;
    public static void main(String args[]){
            //그렇다면 print()사용하는 중에서 줄바꿈을 사용할 수 는 없을까?
        System.out.print(1);
        System.out.println(2);

        //아래 두개의 결과를 예측해보셔요
//        System.out.println("a" + "b");
//        System.out.println('a' + 'b');


        byte by = 127;
//        byte by2 = 128;
        System.out.println("by = " + by);

        char ch = ' ';
//        char ch1 = '';
        System.out.println(ch);
//        System.out.println("ch1 = " + ch1);

        System.out.printf("%c",97);
    }
}
