import java.util.Arrays;

public class in2D {
    static int[] Search(int[][] a,int item){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == item) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9},
        };
        int item = 7;
        System.out.println(item+" is at "+Arrays.toString(Search(arr, item)));
    }
}
