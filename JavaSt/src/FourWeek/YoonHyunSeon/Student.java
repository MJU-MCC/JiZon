package FourWeek.YoonHyunSeon;

public class Student {
    final static int NO = 3;
    // 1. 여기서 따로 배열 안만들고 main에서 2차원배열로 못하나?
    int[] no = new int[NO];
    String[] name = new String[NO];
    public void add(int no, String name){
        if(!(this.no[NO-1]==0 && this.name[NO-1] ==null)){
            System.out.println("스터디 모집이 마감된 팀입니다.");
        }
        for(int i=0;i<NO;i++){
            if(this.no[i] == 0){
                this.no[i] = no;
                this.name[i] = name;
                break;
            }
        }
    }
    public void del(int no, String name){
        int count=0;
        for(int i=0;i<NO;i++){
            if(this.no[i]==no && this.name[i].equalsIgnoreCase(name)) {
                System.out.println(this.no[i]+" "+this.name[i]+"이 삭제되었습니다.");
                this.no[i] = 0;
                this.name[i] = null;
                break;
            }else{
                count++;
            }
        }
        for(int i=0;i<NO;i++){
            if(i>count){
                this.no[i-1] = this.no[i];
                this.name[i-1] = this.name[i];
            }
            if(i==NO-1){
                this.no[i] = 0;
                this.name[i] = null;
            }
        }
        if(count==NO){
            System.out.println("입력한 정보와 일치하는 학생이 없습니다.");
        }
    }
    public void show(){
        System.out.println("학번 이름");
        System.out.println("-------");
        for(int i=0;i<NO;i++){
            if(no[i] != 0){
                System.out.println(no[i] + "   " + name[i]);
            }
        }
    }
}
