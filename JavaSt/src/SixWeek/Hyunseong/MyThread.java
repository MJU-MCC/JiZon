package SixWeek.Hyunseong;

public class MyThread extends Thread{
    static int number = 0;

    @Override
    public void run() {
        for(int i=0; i<100; i++){
            System.out.println("MyThread1의 number 의 숫자는 =  " + number);
            number++;
        }
    }
}
