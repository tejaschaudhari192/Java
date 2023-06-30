import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(2);
        Scanner scan = new Scanner(System.in);

        // list.add(4);
        // // System.out.println(ArrayList.class.toString(list));
        // list.add(5);
        // list.add(6);
        // list.add(7);
        // list.set(1, 0);
        
        // System.out.println(list);
        // System.out.println(list.contains(6));

        for (int i = 0; i < 5; i++) {
            list.add(scan.nextInt());
        }
        // 1
        // System.out.println(list);
        // 2
        // for (Integer i : list) {
        //     System.out.print(i+" ");
        // }
        // 3
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        

    }
}
