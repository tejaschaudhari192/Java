public class LC_1_evendigits {
    public static void main(String[] args) {
        int[] arr = { 12, 345, 64, 7896 };
        System.out.println(evenDigits(arr));
    }
    static int evenDigits(int[] arr){
        int n=0;
        for (int i : arr) {
            String num = Integer.toString(i);
            if (num.length()%2==0) {
                n+=1;
            }
        }
        return n;
    }
}
