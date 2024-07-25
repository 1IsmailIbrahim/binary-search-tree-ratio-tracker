package q2;

public class BST {

    class Node {
        int value;
        Node left, right;

        public Node(int key) {
            value = key;
            left = right = null;
        }
    }

    Node root;
    static float ratioAtTheMoment;
    static float num;
    static float total;

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            num++;
            return root;
        }

        if (key < root.value) {
            root.left = insertRec(root.left, key);
        } else if (key > root.value) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    void insert(int key) {
        root = insertRec(root, key);
        total++;
    }

    void orderRec(Node root) {
        if (root != null) {
            orderRec(root.left);
            orderRec(root.right);
        }
    }

    void order() {
        orderRec(root);
    }
}
