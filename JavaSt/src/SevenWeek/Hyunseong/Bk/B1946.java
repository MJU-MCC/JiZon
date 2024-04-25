package SevenWeek.Hyunseong.Bk;

import java.util.*;
import java.io.*;

class Emplo implements Comparable<Emplo>{
    int docScore;
    int interScore;

    public Emplo(int doc , int inter){
        this.docScore = doc;
        this.interScore = inter;
    }

    @Override
    public int compareTo(Emplo e){
        System.out.print("이 객체의 docScore 점수는 "+this.docScore);
        System.out.println("    매개변수로 들어온 객체의 docScore 점수는 "+e.docScore);
        return this.docScore - e.docScore;
    }

    @Override
    public String toString() {
        return "Emplo{" +docScore +
                ", " +interScore +
                '}';
    }
}
public class B1946 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        ArrayList<Emplo> list = new ArrayList<>();

        for(int i=0; i<number; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int doc = Integer.parseInt(st.nextToken());
            int inter = Integer.parseInt(st.nextToken());
            Emplo e = new Emplo(doc,inter);
            list.add(e);
        }
        list.stream()
                .forEach(System.out::println);

        System.out.println("================================");
        Collections.sort(list);
        System.out.println("================================");

        list.stream()
                .forEach(System.out::println);

    }

}
