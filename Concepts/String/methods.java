import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        String name = new String("skin and loafer");
        // System.out.println(name[0]); 
        System.out.println(name.charAt(0));

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.indexOf('f'));
        System.out.println(" \t bhoju".strip());
        System.out.println(Arrays.toString(name.split(" ")));
        
    }
}
