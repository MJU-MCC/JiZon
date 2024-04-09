package SixWeek.juyoung;

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() { /*현재 위치에 정지 */}
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marine[x=" + x + ",y=" + y + "]");
    }
    void stimPack() { /*현재 위치에 정지 */}
}

public class interface_study {
    public static void main(String[] args) {
        Unit[] group = { new Marine() };

        for (int i=0; i < group.length; i++)
            group[i].move(100, 200);
    }
}


