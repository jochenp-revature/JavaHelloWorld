package src;
import java.util.*;

public class IteratorExample {

    public static void main(String[] args) {
        Collection collection = Arrays.asList("red", "orange", "yellow", "green", "blue", "indigo", "violet");
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
}
