package Hashing.Hashing_Problems;
// Q -> Given an integer array of size n, find all elements that appear more than (n/3) times.

import java.util.*;

public class Majority_Elements {
    public static void majorityElement(int nums[]) {  //O(n)
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                // true
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                // false
                map.put(nums[i], 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) { // O(n)
        int nums[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 }; // 1

        majorityElement(nums);
    }
}
