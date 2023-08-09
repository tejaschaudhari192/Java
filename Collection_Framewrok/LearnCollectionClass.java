import java.util.*;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        Collections.reverse(list);
        System.out.println(list);
        // Collections.sort(list);
    }
}
