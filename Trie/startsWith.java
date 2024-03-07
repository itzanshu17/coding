package Trie;

public class startsWith {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int index = word.charAt(level) - 'a';

            // agar bo element baha nhi hai tho
            if (curr.children[index] == null) {
                curr.children[index] = new Node();

            }
            // current ko update karke us childer per jis se aage jana hai
            curr = curr.children[index];
            curr.eow = true;
        }
    }

    public static boolean StartPrefix(String prefix) {
        Node curr = root;
        int index;
        for (int i = 0; i < prefix.length(); i++) {
            index = prefix.charAt(i) - 'a';

            if (curr.children[index] == null) {
                return false;
            }
            curr = curr.children[index];
        }
        return true;
    }

    public static void main(String[] args) {

        String words[] = { "apple", "app", "mango", "man", "women", "thee" };

        for (String s : words) {
            insert(s);
        }

        String str = "app";
        System.out.println(StartPrefix(str));
    }
}
