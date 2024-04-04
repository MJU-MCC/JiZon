package FourWeek.JongSeok.Chapter6;

import java.util.Scanner;

class Car{
    String color;
    String gearType;
    int door;

    Car(){
        this("white", "auto", 2);
    }
    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    public String getColor(){
        return color;
    }
    public  String getGearType(){
        return gearType;
    }
    public int getDoor(){
        return door;
    }
}
public class Ex6_12 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Scanner scanner = new Scanner(System.in);
        String c = scanner.nextLine();
        String g = scanner.nextLine();
        int d = scanner.nextInt();
        Car c2 = new Car(c, g, d);
        System.out.println("c1 색깔 :" + c1.getColor()+ " c1 기어 :" + c1.getGearType() + " c1 문개수 :" + c1.getDoor());
        System.out.println("c2 색깔 :" + c2.getColor()+ " c2 기어 :" + c2.getGearType() + " c2 문개수 :" + c2.getDoor());

    }
}
