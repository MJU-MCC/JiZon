package FourWeek.Yeonsu;

public class Quiz_array {
    public static void main(String[] args) {
        int[] sizeArray = new int[10];
        for (int i = 0; i < 10; i++) {
            sizeArray[i] = 250 + (5*i);
        }

        for(int size:sizeArray){
            System.out.println("사이즈"+ size + "(재고 있음)");
        }
    }
}
