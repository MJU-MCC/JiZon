package FifthWeek.juyoung;

// 오버라이딩(overriding)

class Point {
    int x;
    int y;

    String getLocation() {
        return "x: " + x + ", y:" + y;
    }
}

class Point3D extends Point {
    int z;

    String getLocation() {
        return "x :" + x + ", y:" + y + ", z:" + z;
    }
}

public class overriding {
    public static void main(String[] args) {

        Point po1 = new Point();
        Point3D po2 = new Point3D();

        System.out.println(po1.getLocation());
        System.out.println(po2.getLocation());
        
    }
}
