import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = { 2, 9, 1, 6, 0, 4, 7, 5, 8, 3 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] a) {
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
}
