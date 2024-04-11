package SixWeek.JongSeok;

public class Playlist {// 플레이리스트
    //Song클래스를 배열로 저장
    private String listname = null; //플레이리스트 이름
    private static Song[] songs = null; //플레이리스트에 저장할 노래배열
    private int size = 0;
    private int n = 0;

    public Playlist(String listname, int size) { //플레이리스트이름과 크기를 초기화하는 생성자
        this.listname = listname;
        this.size = size;
        songs = new Song[size];

    }

    public Song getSong(int j) {
        return songs[j];
    }

    public int getSize() {
        return size;
    }

    public String getListname() {
        return listname;
    }


    //노래 저장
    public void addSonglist(Song song) {
        if (n < songs.length) {
            songs[n++] = song;
        }
    }


    //노래 삭제
    public void deleteSonglist(int index) { //플레이리스트에서 인덱스에 해당하는 노래 삭체
        for (int i = index - 1; i < songs.length - 1; i++) {
            songs[i] = songs[i + 1];
        }
        songs[songs.length - 1] = null;
    }

}
