import java.util.Scanner;

public class linearSeach {
    static int Search(String str, char ch) {
        if (str.length()==0) return -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String name = "Fire Force";
        char item = 'c';
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter char: ");
        // char item = scan.next();

        System.out.println(Search(name, item));
        scan.close();
    }
    
}
