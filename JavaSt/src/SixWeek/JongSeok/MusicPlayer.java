package SixWeek.JongSeok;

import java.util.Random;
import java.util.Scanner;

//Chapter 6,7최대한 활용해서
//뮤직플레이어 만들기
//해결1. 전체 노래목록 20개 정도로해서 노래마다 제목, 노래길이, 가수
//해결2. 플레이리스트마다 구분하고, 플레이리스트마다 곡을 추가 삭제 가능하게
//3. 노래 재생시 재생과 정지, 이전/다음곡, 원하는 곡 듣기
//4. 노래 검색 기능
//5. 볼륨 조절 기능
//6. 재생목록 반복/셔플
/// Test
// 플레이리스트를 ArrayList로 해보는걸로
 public class MusicPlayer {
    private static boolean playing = false; // false면 정지, true이면 재생중, 기본값 정지

    private static Playlist[] playlist = null;
    private static CurrentPlaylist currentPlaylist = new CurrentPlaylist(5);
    private static int Volume = 50;
    private final static int MIN_Volume = 0;
    private final static int MAX_Volume = 100;
    private static boolean PowerOff = false;


    public static void display2(){
        System.out.println("   1.플레이리스트 선택");
        System.out.println("   2.재생");
        System.out.println("   3.다음곡 재생");
        System.out.println("   4.이전곡 재생");
        System.out.println("   5.현재재생목록");
        System.out.println("   6.플레이리스트에 노래 추가");
        System.out.println("   7.플레이리스트의 노래 삭제");
        System.out.println("   8.종료");
        System.out.println("   9.음량 조절+/-");
        System.out.print("숫자를 입력하세요 : ");
    }
    public static void Volumedown(){
        if(Volume <= MIN_Volume){
            System.out.println("<최소 음량입니다.>");
        }else{
            Volume -= 10;
        }
    }
    public static void Volumeup(){
        if(Volume >= MAX_Volume){
            System.out.println("<최대 음량입니다.>");
        }else{
            Volume += 10;
        }
    }
//    public static void Display() { //현재 노래,이전곡, 다음곡 표시
//        if (currentSong == null){
//            System.out.print("[이전곡 업음]");
//            System.out.print("<--[현재곡 업음]-->");
//            System.out.println("[다음곡 업음]");
//            System.out.println("<음량 " + Volume + ">");
//        }else {
//            System.out.print("[이전곡 " + previousSong.getTitle() + "]");
//            if (!playing) {
//                System.out.print("<--[현재곡 : " + currentSong.getTitle() + "]-->");
//            } else {
//                System.out.print("<--[일시정지중 : " + currentSong.getTitle() + "]-->");
//            }
//            System.out.println("[다음곡 : " + nextSong.getTitle() + "]");
//            System.out.println("<음량 " + Volume + ">");
//        }
//    }

    public static void option(int choice) {
        //Display();
        switch (choice){
            case 1 : //1. 플레이리스트 선택
                System.out.println("플레이리스트를 선택하세요.");
                Scanner scanner = new Scanner(System.in);
                int pr = scanner.nextInt();
                for (int i = 0; i < playlist[i].getSize(); i++) {
                    System.out.println("[" + (i + 1) + "번째 노래]  " + playlist[i].getSong(i).getSinger() + "의 <" + playlist[i].getSong(i).getTitle() + ">");
                }
                break;
//            case 2 : //2. 재생
//                System.out.println("노래를 재생합니다.");
//                CurrentPlaylist.Play(songs);
//                break;
//            case 3 :  //3. 다음곡 재생
//                CurrentPlaylist.Next(songs);
//                break;
//            case 4 : //4. 이전곡 재생
//                CurrentPlaylist.Previous(songs);
//                break;
//            case 5 : //5. 현재재생목록 보기
//                System.out.println("현재재생목록");
//                for(int i = 0; i < 5; i++){
//                    System.out.println("[" + (i + 1) + "번째 노래]  " + currentPlaylist.getSong(i).getSinger() + "의 <" + currentPlaylist.getSong(i).getTitle() + ">");
//                }
//                break;
//            case 6 : //6. 노래검색
//                break;
//            case 7 :
//                break;
            case 8 : //8. 종료
                PowerOff = true;
                break;
            case 9 :
                System.out.println("+ : 음량 +10");
                System.out.println("- : 음량 -10");
                Scanner sc = new Scanner(System.in);
                char v = sc.next().charAt(0);
                if( v == '+'){
                    Volumeup();
                }else if(v == '-'){
                    Volumedown();
                }
                break;
            default:
                break;
        }
    }
    public static void main(String[] args) {
        Song[] song = new Song[10]; //전체 노래개수 20개
        song[0] = new Song("아이유", "드라마");
        song[1] = new Song("미노이", "살랑살랑");
        song[2] = new Song("최유리", "동그라미");
        song[3] = new Song("로이킴", "봄봄봄");
        song[4] = new Song("10cm", "부동의 첫사랑");
        song[5] = new Song("Day6", "예뻤어");
        song[6] = new Song("에스파", "spicy");
        song[7] = new Song("자이언티", "No makeup");
        song[8] = new Song("마인드유", "나만없어");
        song[9] = new Song("죠지", "하루종일");
        Playlist[] playlist = new Playlist[3]; // 전체 플레이리스트개수 5개
        playlist[0] = new Playlist("플레이리스트1 ", 5);
        playlist[1] = new Playlist("플레이리스트2 ", 5);
        playlist[2] = new Playlist("플레이리스트3 ", 5);
        Random random = new Random();
        for (int i = 0; i < playlist.length; i++) { //리스트 5개에 노래 할당
            Song.shuffle(song);
            for (int j = 0; j < playlist[i].getSize(); j++) { //리스트마다 노래 할당
                playlist[i].addSonglist(song[j]);  //플레이리스트에 노래 저장
            }
        }
        for(int i = 0; i < playlist.length; i++) { //플레이리스트에 저장된 노래들 확인
            System.out.println(playlist[i].getListname());
            for (int j = 0; j < playlist[i].getSize(); j++) { //리스트마다 노래 할당
                if (playlist[i].getSong(j) != null) {
                    System.out.println("[" + (j + 1) + "번째 노래] " + playlist[i].getSong(j).getSinger() + " || " + playlist[i ].getSong(j).getTitle());
                } else
                    System.out.println("[" + (j + 1) + "번째 노래 : 비어있음] ");
            }
        }
//    do {
//        Display();
//        display2();
//        Scanner scanner = new Scanner(System.in);
//        int choice = scanner.nextInt();
//        option(choice);
//    } while (!PowerOff);


//        for (int j = 0; j < playlist[i].getSize(); j++) { //리스트마다 노래 할당
//            if (playlist[3].getSong(j) != null) {
//                System.out.println("[" + (j + 1) + "번째 노래] " + playlist[3].getSong(j).getSinger() + " || " + playlist[3].getSong(j).getTitle());
//            }else
//                System.out.println("[" + (j + 1) + "번째 노래 : 비어있음] " );
//        }

//

    }






}


