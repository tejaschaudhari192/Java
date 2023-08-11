public class searchInRange {
    static int search(int [] arr, int start, int end, int item){
        for (int i = start; i <= end; i++)
            if (arr[i] == item) return i;
        return -1;
    }
        

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(search(arr, 5, 10, 2));
    }
}
