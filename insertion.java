// import java.util.ArrayList;

// public class insertion {
//     public static void main(String[] args) {
//         // Create an ArrayList
//         ArrayList<Integer> myList = new ArrayList<>();

//         // Add elements to the ArrayList
//         myList.add(2);
//         myList.add(3);
//         myList.add(4);
//         myList.add(5);

//         // Element to insert at the beginning
//         int elementToInsert = 1;

//         // Insert element at the beginning
//         myList.add(0, elementToInsert);

//         // Print the ArrayList
//         for (Integer item : myList) {
//             System.out.println(item);
//         }
//     }
// }

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head;

    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBegin(1);
        list.insertAtBegin(2);
        list.insertAtBegin(3);
        list.insertAtBegin(4);
        list.insertAtBegin(5);
        System.out.print("Linked List: ");
        list.printList();
    }
}
