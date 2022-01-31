package List;
public class Main {
    public static void main(String[] args) {
//        ArrayList <String> list = new ArrayList<>(5);
//        System.out.println("Before adding any element");
//        System.out.println("Capacity : " + list.capacity());
//        System.out.println("Is empty : " + list.isEmpty());
//        System.out.println("Is full : " + list.isFull());
//        list.display();
//        System.out.println("Insert 4 elements");
//        list.insert("CS");
//        list.insert("IT");
//        list.insert("IS");
//        list.insert("MM");
//        System.out.println("Is full : " + list.isFull());
//        System.out.println("Is empty : " + list.isEmpty());
//        System.out.println("Capacity : " + list.capacity());
//        list.display();
//        System.out.println("Update index 2 to 'updated'");
//        list.update(2, "Updated");
//        System.out.println("Search for 'Updated'");
//        System.out.println("Index for 'Updated' is " + list.search("Updated"));
//        System.out.println("Insert 'AA' if no duplicate");
//        list.insertNoDublicate("AA");
//        list.display();
//        System.out.println("Update 'Specific' in index 1");
//        list.update(1, "Specific");
//        System.out.println("Insert 'MM' if no duplicate");
//        list.insertNoDublicate("MM");
//        list.display();
//        System.out.println("Insert 'Test'");
//        list.insert("Test");
//        System.out.println("Capacity : " + list.capacity());
//        System.out.println("Is full : " + list.isFull());
//        System.out.println("Clear array");
//        list.clear();
//        list.display();
//        System.out.println("Capacity : " + list.capacity());

        SinglyLinkedList <Character> list = new SinglyLinkedList<>();
        System.out.println("Before adding eny element");
        System.out.println("capacity : " + list.capacity());
        System.out.println("Is empty : " + list.isEmpty());
        list.display();
        System.out.println("After adding 5 elements");
        list.insert('A');
        list.insert('B');
        list.insert('C');
        list.insert('D');
        list.insert('E');
        System.out.println("capacity : " + list.capacity());
        System.out.println("Is empty : " + list.isEmpty());
        list.display();
        System.out.println("Update index 2 to 'Z'");
        list.update(2, 'Z');
        list.display();
        System.out.println("Insert 'X' in index 3");
        list.insert(3, 'X');
        list.display();
        System.out.println("Value of index 2 is " + list.get(2));
        System.out.println("Remove index 3");
        list.remove(3);
        list.display();
        System.out.println("capacity : " + list.capacity());
        System.out.println("Clear the list");
        list.clear();
        list.display();
        System.out.println("capacity : " + list.capacity());
        System.out.println("Is empty : " + list.isEmpty());
        System.out.println("After adding 5 elements");
        list.insert('&');
        list.insert('|');
        list.insert('^');
        list.insert('+');
        list.insert('-');
        System.out.println("capacity : " + list.capacity());
        list.display();
        System.out.println("Remove index 1");
        list.remove(1);
        list.display();
        System.out.println("Remove first element");
        list.remove();
        list.display();
        System.out.println("Remove last element");
        list.pop();
        list.display();
        System.out.println("capacity : " + list.capacity());
        System.out.println("Insert '*' in first");
        list.insertFirst('*');
        list.display();
        System.out.println("capacity : " + list.capacity());
        System.out.println("Reverse the list");
        list.reverse();
        list.display();
        System.out.println("Search on '^'");
        System.out.println("'^' in index " + list.search('^'));


    }
}