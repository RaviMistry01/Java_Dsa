package Linkedlist.SinglyLinkedList;

public class LL {

    Node head;

    // public static Node getListAfterReverseOperation(Node head, int n, int b[]){

    // int size = 9;

    // if(head == null ) return head;

    // Node curr = head;
    // Node prev = null;
    // Node start = null;
    // for(int i=0 ; i< n; i++){

    // Node End = curr;

    // for(int j = 0 ; j<b[i];j++) {
    // Node temp = curr.Next;
    // curr.Next = prev;
    // prev = curr;
    // curr = temp;
    // start = start.Next;
    // }
    // End.Next = start;

    // }

    // }

    static Node rev(Node head) {

        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node temp = curr.Next;
            curr.Next = prev;
            prev = curr;
            curr = temp;

        }

        return prev;

    }

    void printLinkedList(Node head) {

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " " + "-->");
            curr = curr.Next;
        }

    }

    int size(Node head) {

        Node curr = head;
        int count = 0;

        while (curr != null) {

            curr = curr.Next;
            count++;
        }
        return count;

    }

    int findIndex(int element) {

        Node curr = head;
        int index = 0;

        while (curr != null) {

            if (curr.data == element) {
                return index;
            }

            curr = curr.Next;
            index++;

        }
        return -1;

    }

    void removeLast() {

        Node curr = head;

        while (curr.Next.Next != null) {
            curr = curr.Next;
        }

        curr.Next = null;

    }

    void addAll(int[] elements) {

        for (int element : elements) {
            addLast(element);

        }

    }

    void addLast(int new_data) {

        Node temp = new Node(new_data);

        if (head == null) {
            head = temp;
        } else {

            Node curr = head;

            while (curr.Next != null) {

                curr = curr.Next;
            }

            curr.Next = temp;

        }

    }

    void addFirst(int new_data) {

        Node temp = new Node(new_data);

        if (head == null) {
            head = temp;
        } else {

            temp.Next = head;
            head = temp;

        }
    }

    void addAtIndex(int index, int new_data) {

        Node temp = new Node(new_data);

        if (index == 0) {
            addFirst(new_data);
            return;
        }

        else {

            Node curr = head;
            int count = 0;

            while (count < (index - 1)) {
                curr = curr.Next;
                count = count + 1;
            }

            temp.Next = curr.Next;
            curr.Next = temp;

        }

    }

    public static void main(String[] args) {

        LL l1 = new LL();

        // l1.addAtIndex(0, 0);
        // l1.addFirst(100);
        int[] ar = { 55, 66, 89, 54, 69 };
        l1.addAll(ar);
        // l1.addLast(65);

        System.out.println();
        l1.removeLast();
        l1.printLinkedList(l1.head);

        // System.out.println(l1.size(l1.));
        // l1.printLinkedList(rev(l1.head));
        // System.out.println(l1.findIndex(88));
        // System.out.println();
        // l1.printLinkedList();

    }

}
