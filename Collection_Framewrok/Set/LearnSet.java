import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(); // random order of addings
        // Set<Integer> set = new LinkedHashSet<>(); // as per line order
        // Set<Integer> set = new TreeSet<>(); // in increasing order as bst
        
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(45);
        set.add(2); // duplicate not allowed
        System.out.println(set);
        set.remove(2);
        System.out.println(set);
        System.out.println(set.contains(2) + "\n" + set.isEmpty()+ "\n" + set.size() + "\n");
        set.clear();
        System.out.println(set);

    }
}
