package Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        Scanner scanner = new Scanner(System.in);
        tree.populate(scanner);
        // tree.display();
        tree.preOrder();
        System.out.println();
        tree.inoOrder();
        System.out.println();
        tree.postOrder();
       

       
    }
}
