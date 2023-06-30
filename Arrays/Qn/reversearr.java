import java.util.Arrays;

public class reversearr{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
    
    static void reverse(int[] a){
        int temp;
        int l = a.length;
        for(int i=1;i<l;i++){
            temp = a[i];
            a[i] = a[l-i];
            a[l-i] = temp;
        }
    }
}