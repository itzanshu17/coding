package BinaryTree;

public class minDistance {
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
        System.out.println(minDis(root, 4, 6));

    }

    private static int minDis(Node root, int n, int m) {
        Node lca = lca2(root, n, m);
        int d1 = lcaDistance(lca, n);
        int d2 = lcaDistance(lca, m);
        return d1 + d2;
    }

    private static int lcaDistance(Node root, int m) {
        if (root == null) {
            return -1;
        }
        if (root.data == m) {
            return 0;
        }
        int leftdis = lcaDistance(root.left, m);
        int rightdis = lcaDistance(root.right, m);

        if (leftdis == -1 && rightdis == -1) {
            return -1;
        } else if (leftdis == -1) {
            return rightdis + 1;
        } else {
            return leftdis + 1;
        }
    }

    private static Node lca2(Node root, int n, int m) {
        if (root == null) {
            return null;
        }
        if (root.data == n || root.data == m) {
            return root;
        }

        Node leftlca = lca2(root.left, n, m);
        Node rightlca = lca2(root.right, n, m);

        if (rightlca == null) {
            return leftlca;
        }

        if (leftlca == null) {
            return rightlca;
        }

        return root;
    }

}
