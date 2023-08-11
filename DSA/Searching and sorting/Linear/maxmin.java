public class maxmin {
    static int Max(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    static int Min(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] < min)
                min = a[i];
        return min;
    }

    static int Search(int[] a, int item) {
        for (int i = 0; i < a.length; i++) {
            if (item == a[i])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,0,4,7,-5,34,28,-12,2,8,0};
            int min = Min(arr);
            int max = Max(arr);
            System.out.println("Max: " + max+" at index: " + Search(arr,max));
            System.out.println("Min: " + min+" at index: " + Search(arr,min));
    }
}
