import java.util.ArrayDeque;
import java.util.Deque;

public class LearnDeque {
    public static void main(String[] args) {
        Deque<String> avengers = new ArrayDeque();
        avengers.offer("hawkeye");
        avengers.offer("captain america");
        avengers.offerFirst("spiderman");
        avengers.offerLast("hulk");

        System.out.println(avengers);

        System.out.println("peek: " + avengers.peek());
        System.out.println("peekFirst: " + avengers.peekFirst());
        System.out.println("peekLast: " + avengers.peekLast());

        System.out.println("poll: " + avengers.poll());
        System.out.println("pollFirst: " + avengers.pollFirst());
        System.out.println("pollLast: " + avengers.pollLast());
        System.out.println(avengers);
    }
}
