package FifthWeek.HyunSeong2;

public class PracRecurs {
    private static int recurs(int number , int exp){
        if(number == 0)
            return 1;
        if(exp == 0)
            return 1;

        return number * recurs(number, exp-1);
    }
    public static void main(String args[]){
        System.out.println("PracRecurs.recurs(2,3) = " + PracRecurs.recurs(2, 3));
        System.out.println("PracRecurs.recurs(1,1) = " + PracRecurs.recurs(1, 1));
        System.out.println("PracRecurs.recurs(10,0) = " + PracRecurs.recurs(10, 0));
        System.out.println("PracRecurs.recurs(3,3) = " + PracRecurs.recurs(3, 3));
    }
}
