import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static int Search(int[] a,int item){
        int s=0;
        int e=a.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if (item==a[mid]) {    
                return mid;
            }
            else if (item>a[mid]) {
                s=mid;
            }
            else {
                e=mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,-2,-56,-6,12,56,73,0};
        Arrays.sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
        Scanner scan = new Scanner(System.in);
        
        System.out.println(Search(arr,0));
        scan.close();
    }
}
