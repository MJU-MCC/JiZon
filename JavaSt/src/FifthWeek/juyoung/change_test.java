package FifthWeek.juyoung;

//참조변수의 형변환

class Car {
    String color;
    int door;

    //운전하는 기능
    void drive() {
        System.out.println("drive, Brrrr~");
    }

    //멈추는 기능
    void stop() {
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car {
    //물 뿌리는 기능
    void water () {
        System.out.println("water!!!");
    }
}

public class change_test {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
    }
}
