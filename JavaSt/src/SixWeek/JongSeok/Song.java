package SixWeek.JongSeok;

import java.util.Random;

public class Song { // 노래목록
    private String singer = null; // 가수
    private String title = null; // 노래제목


    public Song(String singer, String title) {
        this.singer = singer;
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public String getTitle() {
        return title;
    }

    public static void shuffle(Object[] array) { //플레이리스트에 중복이 안되게 Song을 할당하기위해 Song[]의 순서를 섞는 메서드
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            // 0에서 i까지의 임의의 인덱스를 선택
            int index = rand.nextInt(i + 1);
            // 현재 인덱스와 랜덤하게 선택된 인덱스의 요소를 교환
            Object temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
        public void AddSong(Song[] song, String singer, String title) { //노래추가
            int i = 0;
            while(song[i] != null) {
                i++;
            }
               song[i] = new Song(singer, title);
        }

        public void DeleteSong(Song[] song, int index) { // 노래삭제
            int i;
            for (i = index-1; song[i] != null; i++){
                song[i] = song[i+1];
            }
        }
}
