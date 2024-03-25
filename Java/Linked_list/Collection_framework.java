package Linked_list;
import java.util.*;

public class Collection_framework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        
        //add
        list.add("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("This");
        list.addLast("list");
        System.out.println(list);

        //size
        System.out.println(list.size());

        //print
        for(int i=0 ; i<list.size() ; i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("Null");

        //delete
       
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

    }
}
