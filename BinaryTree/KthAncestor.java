package BinaryTree;

public class KthAncestor {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binarytree {
        static int index = -1;

        public Node buildtree(int node[]) {
            index++;
            if (node[index] == -1) {
                return null;
            }
            Node newNode = new Node(node[index]);
            newNode.left = buildtree(node);
            newNode.right = buildtree(node);
            return newNode;

        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // main tree
        Binarytree tree = new Binarytree();
        Node root = tree.buildtree(nodes);
        KthAnces(root, 4, 2);
    }

    private static int KthAnces(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int disLeft = KthAnces(root.left, n, k);
        int rightdis = KthAnces(root.right, n, k);
        if (disLeft == -1 && rightdis == -1) {
            return -1;
        }
        int max = Math.max(disLeft, rightdis);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
    }
}
