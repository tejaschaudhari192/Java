import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<String>();
        fruits.push("apple");
        fruits.push("orange");
        fruits.push("mango");
        fruits.push("watermelon");

        System.out.println("Fruits: " + fruits);
        System.out.println("Stack top: " + fruits.peek());
        fruits.pop();
        System.out.println("Fruits after pop: " + fruits);

    }
}
