import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        fun(1,2,3,4,5);
        fun2(1,2,"ruri","kohaku","suika");
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun2(int a, int b, String ...v){
        // System.out.println(a+b+v);
    }
}
