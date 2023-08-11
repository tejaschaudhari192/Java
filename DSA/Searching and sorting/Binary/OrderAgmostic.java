
public class OrderAgmostic {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 3, 4, 5, 6, 7, 8, 9 };
        int[] rra = { 9, 8, 7, 6, 5, 4, 4, 3, 2, 1, 1 };
        System.out.println(Search(arr, 3));
        System.out.println(Search(rra, 3));
    }

    static int Search(int[] a, int item) {
        int s = 0;
        int e = a.length - 1;

        if (a[s] <= a[e]) {
            while (s < e) {
                int mid = s + (e - s) / 2;
                if (item == a[mid]) {
                    return mid;
                } else if (item > a[mid]) {
                    s = mid;
                } else {
                    e = mid;
                }
            }
        } else {
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (item == a[mid]) {
                    return mid;
                } else if (item < a[mid]) {
                    s = mid;
                } else {
                    e = mid;
                }
            }
        }
        return -1;
    }
}
