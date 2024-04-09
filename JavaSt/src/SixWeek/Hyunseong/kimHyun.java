package SixWeek.Hyunseong;
import java.io.*;

public class kimHyun {
    public static void main(String[] args) throws IOException{
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();
        Mythread2 th3 = new Mythread2();
        th1.start();
        th2.start();
        th3.start();
    }
}
