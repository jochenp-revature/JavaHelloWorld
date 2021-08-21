package src;
import java.util.*;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList states = new LinkedList();
        states.add("Alaska");
        states.add("Arizona");
        states.add("Arkansas");
        states.add("California");
        states.add("Colorado");
        states.add("Connecticut");

        states.addFirst("Alabama");
        System.out.println(states);
        System.out.println("Last state in my list is: "+states.getLast());

        ListIterator iterator = states.listIterator(states.size());
        while(iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
