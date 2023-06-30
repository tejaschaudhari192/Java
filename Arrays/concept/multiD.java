// package concept;

import java.util.Arrays;
import java.util.Scanner;

public class multiD {
    public static void main(String[] args) {
        int [][] arr = new int[3][2];
        Scanner scan = new Scanner(System.in);
        // int [][] arr = {
        //     {1, 2, 3},
        //     {4, 5},
        //     {6,7, 8, 9}
        // };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter "+(i+1)+(j+1)+ " : ");
                arr[i][j] = scan.nextInt();
            }
        }
        // 1
        for (int[] i : arr) {
            for (int j = 0; j < i.length; j++) {
                System.out.print(i[j]+" ");
            }
            System.out.println();
        }
        // 2
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
