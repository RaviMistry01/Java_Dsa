package Tree;

public class BST {

    private static class Node {
        int data;
        Node right, left;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    BST() {

        root = null;
    }

    public void insert(int val) {
        root = insert(val, root);
    }

    public Node insert(int val, Node root) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.data) {
            root.left = insert(val, root.left);
        } else {
            root.right = insert(val, root.right);
        }
        return root;
    }

    public void display() {
        display(this.root, "root node :");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.data);
        display(node.left, "left child of " + node.data + ":  ");
        display(node.right, "right child of " + node.data + ":  ");

    }

    public static void main(String[] args) {
        BST b1 = new BST();
        b1.insert(10);
        b1.insert(9);
        b1.insert(8);

        b1.insert(15);
        b1.insert(14);
        b1.insert(20);
        b1.display();

    }

}
