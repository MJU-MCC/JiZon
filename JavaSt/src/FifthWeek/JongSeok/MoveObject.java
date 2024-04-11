package FifthWeek.JongSeok;

public class MoveObject {
    private static int X = 0;
    private static int Y = 0;

    public static void ResetPosition() {
        X = 0;
        Y = 0;
    }

    public void move(int x, int y) {
        X += x;
        Y += y;
    }

    public static void PrintPosition() {
        System.out.println("현재 위치 : " + X + ", " + Y);
    }

    public static void main(String[] args) {
        MoveObject object = new MoveObject();

        object.move(10, 5);
        object.PrintPosition();
        ResetPosition();
        object.PrintPosition();


    }
}
