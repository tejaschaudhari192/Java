public class maxx_array {
    public static void main(String[] args) {
        int[] arr = {6,1,9,4,0,8};
        int max = Max(arr);
        System.out.println(max);
    }

    static int Max(int[] arr) {
        int max = arr[0];
        for (int i : arr)
            if (max < i)
                max = i;
        return max;
    }
}
