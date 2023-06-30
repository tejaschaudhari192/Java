import java.util.ArrayList;
import java.util.Scanner;

public class multiDlist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mlist = new ArrayList<>(3);
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            mlist.add(new ArrayList<>());
        }

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter "+(i+1)+(j+1)+" : ");
                mlist.get(i).add(scan.nextInt());
            }
        }

        // for (ArrayList<Integer> arrayList : mlist) {
        //     System.out.println(arrayList);
        // }

        System.out.println(mlist);
    }    
}
