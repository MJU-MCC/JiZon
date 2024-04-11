package SixWeek.Hyunseong;

public class Mythread2 extends Thread{
        static int number =0;

        @Override
        public void run() {
            for(int i=0; i<100; i++){
                System.out.println("Mythread2 의 number 의 숫자는 =  " + number);
                number++;
            }
    }
}
