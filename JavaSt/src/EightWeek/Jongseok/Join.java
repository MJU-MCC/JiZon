package EightWeek.Jongseok;

import java.util.StringJoiner;

public class Join {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");
        StringJoiner sj = new StringJoiner(",", "<", ">");
        for(String str : arr){
            sj.add(str);
        }
        System.out.println(sj.toString());
    }
}
