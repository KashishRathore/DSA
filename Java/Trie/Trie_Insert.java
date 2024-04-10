package Trie;

public class Trie_Insert {
    static class Node{
        Node [] children;
        boolean endOfWord;

        public Node(){
           children = new Node[26]; //a to z
           for(int i=0; i<26; i++){
              children[i] = null;
           }
           endOfWord = false;
        }
    }

    static Node root = new Node();

    // Insert
    public static void insert(String word){
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(root.children[idx] == null){
                //add new node
                root.children[idx] = new Node();
            }
            root = root.children[idx];

            if(i == word.length()-1){
                root.children[idx].endOfWord = true;
            }

            root = root.children[idx];
        }
    }

    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
    }
}
 