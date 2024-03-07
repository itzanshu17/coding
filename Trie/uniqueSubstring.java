package Trie;

public class uniqueSubstring {
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

    public static void main(String[] args) {
        String str = "ababa";
        for (int i = 0; i < str.length(); i++) {
            insert(str.substring(i));
        }

        System.out.println(countSub(root));
    }

    private static int countSub(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count = count + countSub(root.children[i]);
            }
        }
        return count + 1;
    }
}
