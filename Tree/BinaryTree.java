package Tree;

import java.util.*;



class BinaryTree {

    private Node root;

    private static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    // insert elements

    public void populate(Scanner scanner) {
        System.out.println("Enter the value of root Node :");
        int data = scanner.nextInt();

        root = new Node(data);

        populate(scanner, root);
    }
    

    private void populate(Scanner scanner, Node node) {

        System.out.println("Do you want to insert value in left side of " + node.data);
        boolean left = scanner.nextBoolean();

        if (left) {
            System.out.println("Enter the value to insert in left of node  " + node.data);

            int data = scanner.nextInt();

            node.left = new Node(data);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to insert value in right side of " + node.data);
        boolean right = scanner.nextBoolean();

        if (right) {
            System.out.println("Enter the value to insert in right of node  " + node.data);

            int data = scanner.nextInt();

            node.right = new Node(data);
            populate(scanner, node.right);
        }

    }

    public void display() {
        display(this.root, "");
    }

    
    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.data);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");

    }
}