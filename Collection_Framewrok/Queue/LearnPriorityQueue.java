import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        // Queue<Integer> queue = new PriorityQueue<>();
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.add(30);
        queue.add(12);
        queue.add(24);
        queue.add(36);
        System.out.println(queue);

        // queue.poll();
        // queue.remove();
        // System.out.println(queue);
        System.out.println(queue.peek());

        // PriorityQueue<String> avengers = new PriorityQueue<>();
        // avengers.
    }
}
