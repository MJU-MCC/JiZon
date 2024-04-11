package SixWeek.JongSeok;

public class CurrentPlaylist extends Playlist { //현재재생목록
    private static Song previousSong = null; // 이전곡
    private static Song currentSong = null; //현재 재생 노래
    private static Song nextSong = null; //다음곡
    private static int currentplayindex = 0; // Previous(), Next(), Play() 메서드를 사용하기위한 index값
    private static Playlist playlist = null;


    // 플레이리스트와 동일하게 노래를 배열로 저장
    public CurrentPlaylist(int size) { //이름이 "현재재생목록"인 PlayList 생성
        super("현재재생목록", size); //CurrentPlaylist의 생성자
        playlist = new Playlist("", size); //
        currentplayindex = 0;
    }
    public void currentfromplaylist(Playlist playlist){
        CurrentPlaylist currentPlaylist = new CurrentPlaylist(getSize());
        currentPlaylist = (CurrentPlaylist) playlist;
    }
    public Playlist getPlaylist(){
            return playlist;
    }


    // 노래 저장, 노래 삭제
    // 플레이리스트를 현재 재생목록으로 가져오기

//    public void Next(Song[] song) { //다음곡재생
//        if(currentplayindex == song.length -1){ //마지막곡 재생중
//            System.out.println("마지막 곡입니다.");
//        }else if(currentplayindex == song.length - 2){ //마지막 전곡 재생중
//            previousSong = currentSong;
//            currentSong = nextSong;
//            nextSong = null;
//            currentplayindex += 1;
//        }else{
//            previousSong = currentSong;
//            currentSong = nextSong;
//            nextSong = song[currentplayindex + 2];
//            currentplayindex += 1;
//        }
//
//    }
//    public void Previous(Song[] song) { //이전곡재생
//        if (currentplayindex == 0) { //첫곡 재생중
//            System.out.println("첫 곡입니다.");
//        } else if (currentplayindex == 1) { //두번째 곡 재생중
//            nextSong = currentSong;
//            currentSong = previousSong;
//            previousSong = null;
//            currentplayindex -= 1;
//        } else {
//            nextSong = currentSong;
//            currentSong = previousSong;
//            previousSong = song[currentplayindex - 2];
//            currentplayindex -= 1;
//        }
//    }
//    public void Play(Song[] song) { // 플레이리스트 첫곡 자동재생
//        currentplayindex = 0;
//        playing = true;
//        currentSong = song[currentplayindex];
//    }
//    public void Stop() { // 일시정지
//        playing = false;
//    }

}
