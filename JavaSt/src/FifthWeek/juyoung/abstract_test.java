package FifthWeek.juyoung;

abstract class Unit {
    int x,y;
    abstract void move(int x, int y);
    void stop() {}
}

class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("Tank[x=" + x + ",y=" + y + "]");
    }
    void changeMode() {}
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marine[x=" + x + ",y=" + y + "]");
    }
    void stimPack() {}
}

class Dropship extends Unit {
    void move(int x, int y) {
        System.out.println("Dropship[x=" + x + ",y=" + y + "]");
    }
    void load() {}
    void unload() {}
}

public class abstract_test {
    public static void main(String[] args) {
        Unit[] group = { new Marine(), new Tank(), new Dropship()};

        for (int i =0; i < group.length; i++) {
            group[i].move(100, 200);
        }
    }
}
