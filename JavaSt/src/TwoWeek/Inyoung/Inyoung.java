package TwoWeek.Inyoung;

public class Inyoung {
    public static void main(String[] args) {
        Compose takeout = new Compose("딸기라떼", 3500, 2);
        System.out.println(takeout.ment());
        System.out.println(takeout.priceMent());
        System.out.println(takeout.order());

        Ediya smartOrder = new Ediya("토피넛라떼", 3500, 5);
        System.out.println(smartOrder.ment());
        System.out.println(smartOrder.priceMent());
        System.out.println(smartOrder.order());

        Starbucks siren = new Starbucks("아이스카페모카", 5600, 1);
        System.out.println(siren.ment());
        System.out.println(siren.priceMent());
        System.out.println(siren.order());

        Calculator calculator = new Calculator();
        calculator.setSt(takeout);
        calculator.calc();
        calculator.setSt(smartOrder);
        calculator.calc();
        calculator.setSt(siren);
        calculator.calc();

        calculator.sumInfo();
        calculator.savePoint();

//        Customer me = new Customer("박인영", 5000); //여기 포인트 적립부분을 Calculator 클래스를 활용해서 수식 계산후 기입하고 싶은데 어떻게 해야할지 모르겠음...
//        System.out.println(me.showInfo());

    }
}
