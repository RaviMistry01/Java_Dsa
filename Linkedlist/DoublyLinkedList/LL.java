package Linkedlist.DoublyLinkedList;

public class LL {

    Node head;
    Node tail;


    static Node rev(Node head) {

        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }

        return prev;

    }

    void printLinkedList(Node head) {

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " " + "-->");
            curr = curr.next;
        }

    }

    void add(int element) {

        Node temp = new Node(element);

        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    public static void main(String[] args) {

        LL l1 = new LL();

        l1.add(25);
        l1.add(26);
        l1.add(27);

        l1.printLinkedList(l1.head);
        System.out.println();
        
        l1.printLinkedList(rev(l1.head));
     

        // System.out.println(l1.tail.data);

        // System.out.println(l1.rev(l1.head));

    }

}
