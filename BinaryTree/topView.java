package BinaryTree;

import java.util.*;

public class topView {
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
        topViewOftree(root);
    }

    static class info {
        Node node;
        int horiDis;

        public info(Node node, int horiDis) {
            this.node = node;
            this.horiDis = horiDis;
        }
    }

    public static void topViewOftree(Node root) {
        // level order traversal
        // queue bana lete hai level order karne ke liye
        Queue<info> q = new LinkedList<>();

        // unique values ke liye hashmap
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;

        q.add(new info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            info currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }

            else {
                if (!map.containsKey(currNode.horiDis)) {
                    map.put(currNode.horiDis, currNode.node);
                }

                if (currNode.node.left != null) {
                    q.add(new info(currNode.node.left, currNode.horiDis - 1));
                    min = Math.min(min, currNode.horiDis - 1);
                }
                if (currNode.node.right != null) {
                    q.add(new info(currNode.node.right, currNode.horiDis + 1));
                    max = Math.max(max, currNode.horiDis + 1);
                }
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }
}
