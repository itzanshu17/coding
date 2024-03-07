package BinaryTree;

public class TransformSum {
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
        tsum(root);
        preOrder(root);
    }

    private static int tsum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftsum = tsum(root.left);
        int rightsum = tsum(root.right);
        int data = root.data;
        if (root.left != null && root.right != null) {
            root.data = leftsum + rightsum + root.left.data + root.right.data;
        } else {
            root.data = leftsum + rightsum;
        }
        return data;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
