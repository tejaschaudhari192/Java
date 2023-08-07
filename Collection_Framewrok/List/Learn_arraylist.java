
// package Collection_Framwork;
import java.util.*;

public class Learn_arraylist {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList();
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(1, 50);
        System.out.println(list);

        List<Integer> newlist = new ArrayList();
        newlist.add(5);
        newlist.add(10);
        list.addAll(newlist);
        System.out.println(list);

        // list.remove(1);
        list.remove(Integer.valueOf(50)); // either index / object
        System.out.println(list);

        System.out.println(list.get(2));

        list.set(0, 11);
        // list.clear();
        System.out.println(list);

        // .contains() like (i in list).

        System.out.println(list.contains(5));
        System.out.println(list.contains(50));

        // System.out.println(list);
        
        // traversing list

        for (int i = 0; i < list.size(); i++) {
            // arr.lenght -> list.size()
            System.out.println(list.get(i));
        }

        // iterator object

        Iterator<Integer> it=list.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator " + it.next());
        }

        // foreach recommended by anuj

        

    }
}
