package TwoWeek.Jiwon;

public class Jiwon {
    public static void main(String[] args) {
        강아지 dog=new 강아지();
        고양이 cat=new 고양이();
        고래 whale=new 고래();
        독수리 eagle=new 독수리();
        펭귄 pang=new 펭귄();

        포유류[] 포 =new 포유류[] {dog,cat,whale};
        조류 [] 조=new 조류[] {eagle,pang};
        동물 [] ani =new 동물[]{dog,cat,whale,eagle,pang};
        System.out.println("<동물 사전집>");
        for(int i=0; i<ani.length; i++){
            ani[i].eat();
            ani[i].live();
            ani[i].sound();
            System.out.println("=======================");
        }

        System.out.println("<포유류만 보기>");
        for(int i=0;i<포.length;i++){
            포[i].eat();
            포[i].live();
            포[i].sound();
            포[i].포유류특징();
            System.out.println("=======================");
        }

        System.out.println("<조류만 보기>");
        for(int i=0;i<조.length;i++){
            조[i].eat();
            조[i].live();
            조[i].sound();
            조[i].조류특징();
            System.out.println("=======================");
        }

        System.out.println("<물을 좋아하는 동물만 봐봐>");
        물생활[] water=new 물생활[] {whale,pang};
        for(int i=0; i<water.length;i++){
            water[i].waterlove();
            System.out.println("=======================");

        }
    }
}
