import java.util.ArrayList;

public class insertion {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> myList = new ArrayList<>();

        // Add elements to the ArrayList
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        // Element to insert at the beginning
        int elementToInsert = 1;

        // Insert element at the beginning
        myList.add(0, elementToInsert);

        // Print the ArrayList
        for (Integer item : myList) {
            System.out.println(item);
        }
    }
}
