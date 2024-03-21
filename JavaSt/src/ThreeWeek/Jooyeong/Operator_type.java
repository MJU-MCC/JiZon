package ThreeWeek.Jooyeong;
class Animal {}                 // instanceof 연산자의 사용방법 / 부모 클래스
class Dog extends Animal {}     // Animal 클래스를 상속받는 Dog 클래스

public class Operator_type {
    public static void main(String[] args) {
        
        //02. 연산자의 타입

        
        //  &연산자
        // &연산은 두 개의 비트가 모두 1일 때 1을 반환하는 연산

        int num1 = 15;    //00001111
        int num2 = 20;    //00010100
        int num3 = num1 & num2; //num1과 num2의 비트단위 연산

        // num3 --> 00000100 
        System.out.printf("AND 연산의 결과: %d\n", num3);



        //      <<연산자
        //      num1<<num2 의 경우 num1의 비트 열을 num2칸씩 왼쪽으로 이동시킨 결과를 반환

        int num = 15;       //00001111

        int result1 = num << 1;     //num비트 열을 왼쪽으로 1칸씩 이동
        int result2 = num << 2;     //num비트 열을 왼쪽으로 2칸씩 이동

        System.out.printf("<< 연산 1칸 이동 결과: %d\n", result1);      //00011110
        System.out.printf("<< 연산 2칸 이동 결과: %d\n", result2);      //00111100

        // >>연산은 오른쪽으로 이동


        Animal a = new Animal();
        Dog d = new Dog();
        
        System.out.println(a instanceof Animal);  // true, a는 Animal의 인스턴스입니다.
        System.out.println(d instanceof Dog);     // true, d는 Dog의 인스턴스입니다.
        System.out.println(d instanceof Animal);  // true, d는 Animal을 상속받으므로 Animal의 인스턴스이기도 합니다.
        System.out.println(a instanceof Dog);     // false, a는 Dog의 인스턴스가 아닙니다.

    }
}
