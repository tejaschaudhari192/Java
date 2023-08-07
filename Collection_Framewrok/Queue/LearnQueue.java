import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(12);
        q.offer(24);
        q.offer(36);
        System.out.println(q);
        System.out.println(q.poll()+"\n"+q);
        System.out.println("Queue top: "+ q.peek());
        q.remove();
        q.remove();
        // q.remove(); -> throws exception if queue is empty
        q.poll(); // -> safe
        System.out.println(q);

    }
}
