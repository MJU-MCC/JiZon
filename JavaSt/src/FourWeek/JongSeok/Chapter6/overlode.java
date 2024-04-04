package FourWeek.JongSeok.Chapter6;

public class overlode {
    int a;
    int b;
    overlode(int a, int b){
        this.a = a;
        this.b = b;
    }
    overlode(){
        this(1, 2);
    }

    public final int get(){ //final 오버로딩은 되네 오버라이딩이 안되고
        return a;
    }
    public  int get(int a){
        return b = a +b;
    }

    public static void main(String[] args) {
        overlode o1 = new overlode();
        overlode o2 = new overlode(3, 4);

        System.out.println(o1.get());
        System.out.println(o2.get(5));

    }


}
