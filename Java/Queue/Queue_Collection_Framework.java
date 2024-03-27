package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Collection_Framework {
    // Queue is not a class it is an interface
    // as we know objects are made of classes only
    // Queue con iplement only by two ways LinkedList and ArrayDequeue
    public static void main(String[] args) {
        // Same operation like LinkedList
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        // Only difference on ArrayDeque and LinkedList is on the memory cache

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
