package EightWeek.Jongseok;

public class Mytest {
    public static void main(String[] args) {
    }
    class MyException extends Exception{
        private final int ERR_CODE;

        MyException(String msg, int errcode){
            super(msg);
            ERR_CODE = errcode;
        }
        MyException(String msg){
            this(msg, 100);
        }
        public int getERRCODE(){
            return ERR_CODE;
        }
    }
}
