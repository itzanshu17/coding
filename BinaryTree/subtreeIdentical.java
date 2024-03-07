package BinaryTree;

public class subtreeIdentical {
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
        // subtree
        Node root2 = new Node(2);
        root2.left = new Node(4);
        root2.right = new Node(5);

        System.out.println(isSubTree(root, root2));
    }

    // two check where the subrrot equal to node in tree
    public static boolean isSubTree(Node Root, Node subRoot) {
        if (Root == null) {
            return false;
        }
        if (Root.data == subRoot.data) {
            if (isIdentical(Root, subRoot)) {
                return true;
            }
        }
        boolean leftans = isSubTree(Root.left, subRoot);
        boolean rightans = isSubTree(Root.right, subRoot);
        return leftans || rightans;
    }

    // to check the node we get is equal in both
    private static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }
        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        return true;
    }

}
