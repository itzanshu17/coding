package BinaryTree;

import java.util.ArrayList;

public class lowestCommonAncester {
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
        lca(root, 4, 5);
        System.out.println(lca2(root, 4, 6).data);
        System.out.println("hiii");
        System.out.println(minDis(root, 4, 6));

    }

    public static int minDis(Node root, int n, int m) {
        Node lca = lca2(root, n, m);
        int d1 = lcaDistance(lca, n);
        int d2 = lcaDistance(lca, m);
        System.out.println("haah");
        return d1 + d2;
    }

    public static int lcaDistance(Node root, int m) {
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

    public static Node lca2(Node root, int n, int m) {
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

    private static void lca(Node root, int n, int m) {
        ArrayList<Node> l1 = new ArrayList<>();
        ArrayList<Node> l2 = new ArrayList<>();
        getpath(root, l1, n);
        getpath(root, l2, m);

        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i) != l2.get(i)) {
                System.out.println(l1.get(i - 1).data);
                return;
            }
        }
    }

    private static boolean getpath(Node root, ArrayList<Node> list, int m) {
        if (root == null) {
            return false;
        }
        list.add(root);
        if (root.data == m) {
            return true;
        }
        boolean fleft = getpath(root.left, list, m);
        boolean fRight = getpath(root.right, list, m);

        if (fleft || fRight) {
            return true;
        }
        list.remove(list.size() - 1);
        return false;
    }
}
