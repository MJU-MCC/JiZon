package NineWeek.Jongseok;
import java.util.HashSet;
import java.util.TreeSet;
public class hashtree {

        public static void main(String[] args) {
            // HashSet 예제
            HashSet<Integer> hashSet = new HashSet<>();
            hashSet.add(5);
            hashSet.add(2);
            hashSet.add(8);
            hashSet.add(2); // 중복 요소를 허용하지 않으므로 추가되지 않음

            System.out.println("HashSet:");
            for (Integer num : hashSet) {
                System.out.println(num);
            }

            // TreeSet 예제
            TreeSet<Integer> treeSet = new TreeSet<>();
            treeSet.add(5);
            treeSet.add(2);
            treeSet.add(8);
            treeSet.add(2); // 중복 요소를 허용하지 않으므로 추가되지 않음

            System.out.println("\nTreeSet:");
            for (Integer num : treeSet) {
                System.out.println(num);
            }
        }
}
