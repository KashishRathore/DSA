package Hashing;

import java.util.*;

public class Hashmap_Implementation {
    static class HashMap<K, V> { // generics
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
        private LinkedList<Node> buckets[]; // N = buckets.Length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int bi = key.hashCode(); // return any integer number
            return Math.abs(bi) % N; // 0 to N-1
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i; // di
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")

        private void rehash() {
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[N * 2];

            for (int i = 0; i < N * 2; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];
                for (int j = 0; j < oldBuckets.length; j++) {
                    Node node = ll.get(i);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // data index

            if (di == -1) {
                // key doesn't exist
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                // key exist
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lamda = (double) n / N;
            if (lamda >= 2.0) {
                // rehashing
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // data index

            if (di == -1) {
                // key doesn't exist
                return false;
            } else {
                // key exist
                return true;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // data index

            if (di == -1) {
                // key doesn't exist
                return null;
            } else {
                // key exist
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // data index

            if (di == -1) {
                // key doesn't exist
                return null;
            } else {
                // key exist
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) { // bi
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) { // di
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }

    }

    public static void main(String[] args) {
        // Hashing -> Changing the form of data
        // Example -> "abc" --> 3586
        // probably used to store the password
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);

        ArrayList<String> keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }

        map.remove("India");
        System.out.println(map.get("India"));
    }
}
