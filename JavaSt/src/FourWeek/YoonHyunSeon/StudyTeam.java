package FourWeek.YoonHyunSeon;

import java.util.Scanner;

public class StudyTeam {
    final static int team = 4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] st = new Student[team]; // 4팀
        //Student[][] st = new Student[4][6]; // 1.
        // 2. 밑에 코드 마음에 안들어요...
        st[0] = new Student();
        st[1] = new Student();
        st[2] = new Student();
        st[3] = new Student();

        int n =0;
        while(n!=4){
            System.out.println("--------------------------");
            System.out.println("1.스터디원 추가");
            System.out.println("2.스터디원 삭제");
            System.out.println("3.스터디원 명단 출력");
            System.out.println("4.종료");
            System.out.print("번호를 선택해주세요 : ");
            n = sc.nextInt();
            System.out.println("--------------------------");

            if(n==1){
                System.out.print("추가할 팀, 학번, 이름을 입력해주세요 : ");
                int team = sc.nextInt();
                int no = sc.nextInt();
                String name = sc.nextLine();
                st[team].add(no, name);
            }else if (n==2){
                System.out.print("삭제할 학생의 팀, 학번, 이름을 입력해주세요 : ");
                int team = sc.nextInt();
                int no = sc.nextInt();
                String name = sc.nextLine();
                st[team].del(no, name);
            }else if(n==3){
                System.out.print("명단을 출력할 팀을 입력해주세요 : ");
                int team = sc.nextInt();
                st[team].show();
            }else if(n==4){ // exit
            }else{
                System.out.println("다시 입력해주세요.");
            }
        }
    }
}
