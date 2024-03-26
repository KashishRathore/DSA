package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    // Set does'nt allowed duplicate
    // Use when time complexity should reduce or making code efficient
    //It may be jumbled or may order be changed

    public static void main(String[] args) {
        // Creating
        HashSet<Integer> set = new HashSet<>();

        // Inserting
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        //Print all elements
        System.out.println(set);

        // Size
        System.out.println("Size of set is : " + set.size());

        // Search - contains
        if (set.contains(1)) {
            System.out.println("Set contains One");
        }
        if (!set.contains(6)) {
            System.out.println("Set does not contains Six");
        }

        //Iterator
        Iterator it = set.iterator();
        //hasNext function -> return true or false if iterator has next value then it returns true and if not it return false
        //next fuction -> return next value after null and other next
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // Delete
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("We deleted 1");
        }

    }

}
