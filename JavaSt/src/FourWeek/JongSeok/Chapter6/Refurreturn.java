package FourWeek.JongSeok.Chapter6;
class Data3 {int x;}
public class Refurreturn {
    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x = 10;

        Data3 d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);

    }

    static Data3 copy(Data3 d){
        Data3 tmp = new Data3();
        tmp.x = d.x * 10; // 주소 복사가 아닌 d.x를 tmp.x에 복사
        return tmp; //복사한 tmp객체의 주소 리턴
    }
}
