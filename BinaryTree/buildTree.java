package BinaryTree;

import java.util.*;

public class buildTree {
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

        public void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        public int height(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh) + 1;
        }

        public int CountNode(Node root) {
            if (root == null) {
                return 0;
            }
            int lc = CountNode(root.left);
            int rc = CountNode(root.right);
            return lc + rc + 1;
        }

        public int SumNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int currN = root.data;
            int ls = SumNodes(root.left);
            int rs = SumNodes(root.right);
            return ls + rs + currN;
        }

        // second part of tree O(n^2)

        public int diameter(Node root) {
            if (root == null) {
                return 0;
            }
            int leftD = diameter(root.left);
            int leftH = height(root.left);
            int rightD = diameter(root.right);
            int rightH = height(root.right);

            int rootD = leftH + rightH + 1;
            return Math.max(leftD, (Math.max(rightD, rootD)));
        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Binarytree tree = new Binarytree();
        Node root = tree.buildtree(nodes);
        System.out.print("Preorder Traversal  :-  ");
        tree.preOrder(root);
        System.out.println();
        System.out.print("InOrder Traversal   :-  ");
        tree.inOrder(root);
        System.out.println();
        System.out.print("Postorder Traversal :-  ");
        tree.postOrder(root);
        System.out.println();
        System.out.println("Levelorder Traversal :-  ");
        tree.levelOrder(root);
        System.out.println();
        System.out.println("Height of this tree is :" + tree.height(root));
        System.out.println("Count of Nodes : " + tree.CountNode(root));
        System.out.println("Sum of Nodes : " + tree.SumNodes(root));
        System.out.println("Diameter of the tree :" + tree.diameter(root));
        System.out.println("O(n) Diameter : " + diameter2(root).diam);

        System.out.println(valid(root, -100, 100));

    }

    static class Info {
        int diam;
        int height;

        public Info(int diam, int height) {
            this.diam = diam;
            this.height = height;
        }
    }

    // Diameter 2 O(n)
    public static Info diameter2(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }

        Info lInfo = diameter2(root.left);
        Info rInfo = diameter2(root.right);

        int fHeight = Math.max(lInfo.height, rInfo.height) + 1;
        int fDiameter = Math.max(lInfo.diam, Math.max(rInfo.diam, (lInfo.height + rInfo.height + 1)));

        return new Info(fDiameter, fHeight);
    }

    private static boolean valid(Node root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (min < root.data && root.data < max) {
            boolean cl = valid(root.left, min, root.data);
            boolean cr = valid(root.right, root.data, max);

            if (cl == true && cr == true) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
