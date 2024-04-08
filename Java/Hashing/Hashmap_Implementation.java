package Hashing;

import java.util.*;

public class Hashmap_Implementation {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n - Total no. of Nodes
        private int N; // N - Total no. of Buckets
        private int arr[];
        private LinkedList<Node> buckets[]; // N = buckets.Length

        @SuppressWarnings("Unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

      

        public void put(K key, V value){
           
        }

        public boolean containsKey(K key){
            return false;
        }

        public V remove(K key){
            return null;
        }

        public V get(K key){
            return null;
        }

        public ArrayList<K> keySet(){
            return null;
        }

        public boolean isEmpty(){
            return false;
        }

    }

    public static void main(String[] args) {
        // Hashing -> Changing the form of data
        // Example -> "abc" --> 3586
        // probably used to store the password
    }
}
