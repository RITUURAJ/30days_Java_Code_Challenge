class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Add a new node to the end of the linked list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Traverse and print the elements of the linked list
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.append(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);

        System.out.print("Linked List elements: ");
        myList.traverse();
    }
}
