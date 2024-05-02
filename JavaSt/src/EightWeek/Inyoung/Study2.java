package EightWeek.Inyoung;

public class Study2 {
    public static void main(String[] args) {
        int n1 = 10;
        long n2 = 20;
        double n3 = 10.10;
        float n4 = 20.20f;

// Autoboxing 기본 타입(int, long, double 등)을 기본 타입의 Wrapper 클래스(Integer, Long, Double 등) 객체로 자동 변환해주는 것
        Integer a1 = n1;
        Long a2 = n2;
        Double a3 = n3;
        Float a4 = n4;

        Integer v1 = Integer.valueOf(10);
        Long v2 = Long.valueOf(20);
        Double v3 = Double.valueOf(10.10);
        Float v4 = Float.valueOf(20.20f);

// Unboxing Wrapper 클래스 객체를 기본 타입으로 변환해주는 것
        int b1 = v1;
        long b2 = v2;
        double b3 = v3;
        float b4 = v4;

        //잘이해가 안된다.ㅏ...

        int primitiveInt = 30;
        Integer wrappedInt = primitiveInt; // Autoboxing

        System.out.println("Wrapped Integer: " + wrappedInt);

        int unboxedInt = wrappedInt; // Unboxing

        System.out.println("Primitive int: " + unboxedInt);

    }
}
