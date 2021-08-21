package src;
import java.util.*;

public class QueueExample {
    
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i<=10; i++)
        {
            queue.add(i);
        }
        System.out.println("Elements in the queue: "+queue);
        int removed = queue.remove();
        System.out.println(removed + " was removed");

        int top = queue.peek();
        System.out.println("Top element is: "+top);

        System.out.println(queue);
    }

}
