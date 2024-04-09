package Hashing.Hashmap_Problems;
// Q-> Union of Two array
import java.util.*;

public class Union_Of_Array {
    public static void union(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int j=0; j<arr2.length; j++){
            set.add(arr2[j]);
        }

        System.out.println(set.size());

        for(int key : set){
            System.out.print(key + " ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        union(arr1, arr2);
    }
}
