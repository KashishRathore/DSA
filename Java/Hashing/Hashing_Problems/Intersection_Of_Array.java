package Hashing.Hashing_Problems;

// Q-> Intersection of Two array

import java.util.*;

public class Intersection_Of_Array {
    public static int intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int j = 0; j < arr2.length; j++) {
            if (set.contains(arr2[j])) {
                System.out.print(arr2[j] + " ");
                count++;
                set.remove(arr2[j]);
            }
        }

        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        System.out.println(intersection(arr1, arr2));
    }
}
