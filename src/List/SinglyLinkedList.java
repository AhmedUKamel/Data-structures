package List;
public class SinglyLinkedList <type> {
    // attributes
    private class Node {
        private type value;
        private Node next;
    }
    private Node head;
    private Node tail;
    private int ctr;

    // methods
    /*---------------------------------------------- Insertion ----------------------------------------------*/
    /*
     * 1: insertFirst() takes only element to add it in begin of list
     * 2: insert() takes only element to add it in end of list
     * 3: insert() takes value and specific index to add in
     * */

    public void insertFirst(type element) {
        if (isEmpty()) {
            head = tail = new Node();
            head.value = element;
        } else {
            Node ptr = head;
            head = new Node();
            head.value = element;
            head.next = ptr;
        } ctr++;
    }

    public void insert(type element) {
        if (isEmpty()) {
            head = tail = new Node();
            head.value = element;
        } else {
            tail = tail.next = new Node();
            tail.value = element;
        } ctr++;
    }

    public void insert(int position, type element) {
        if(isValidPosition(position)) {
            Node ptr = head;
            for (int i = 0; i < position - 1; i++)
                ptr = ptr.next;
            Node newNode = new Node();
            newNode.value = element;
            newNode.next = ptr.next;
            ptr.next = newNode;
            ctr++;
        } else
            System.out.println("Invalid range");
    }

    /*---------------------------------------------- Removal ----------------------------------------------*/

    /*
     * 1: remove() takes index as a parameter to remove it
     * 2: overloaded remove() doesn't take parameters and remove the first element in list
     * 3: pop() doesn't take parameters and remove the last element in list
     * 4: clear() delete all elements from list
     * */

    public void remove(int position) {
        if(isEmpty())
            System.out.println("LinkedList is Underflow");
        else if (!isValidPosition(position))
            System.out.println("Invalid range");
        else {
            Node ptr = head;
            for (int i = 0; i < position - 1; i++)
                ptr = ptr.next;
            ptr.next = ptr.next.next;
            ctr--;
        }
    }

    public void remove() {
        if(isEmpty())
            System.out.println("LinkedList is Underflow");
        else {
            head = head.next;
            ctr--;
        }
    }

    public void pop() {
        if(isEmpty())
            System.out.println("LinkedList is Underflow");
        else {
            Node ptr = head;
            while (ptr.next.next != null)
                ptr = ptr.next;
            ptr.next = null;
            ctr--;
        }
    }

    public void clear() {
        head = tail = null;
        ctr = 0;
    }

    /*---------------------------------------------- Update ----------------------------------------------*/

    public void update(int position, type element) {
        if(isEmpty())
            System.out.println("LinkedList is Underflow");
        else if (!isValidPosition(position))
            System.out.println("Invalid range");
        else {
            Node ptr = head;
            for (int i = 0; i < position; i++)
                ptr = ptr.next;
            ptr.value = element;
        }
    }

    /*---------------------------------------------- Display ----------------------------------------------*/

    /*
     * display() method takes a boolean input to print the elements ( nodes ) in two different orders ( ascending / descending ).
     * in case of list contains no elements
     * */

    public void display() {
        System.out.print("[ ");
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.value + " ");
            ptr = ptr.next;
        } System.out.println("]");
    }

    /*---------------------------------------------- Search ----------------------------------------------*/

    public int search(type element) {
        Node ptr = head;
        int idx = 0;
        while (ptr != null) {
            if (ptr.value.equals(element))
                return idx;
            else {
                ptr = ptr.next;
                idx++;
            }
        } return -1;
    }

    /*---------------------------------------------- Access ----------------------------------------------*/

    public type get(int position) {
        if(isEmpty())
            System.out.println("LinkedList is Underflow");
        else if (!isValidPosition(position))
            System.out.println("Invalid range");
        else {
            Node ptr = head;
            for (int i = 0; i < position; i++)
                ptr = ptr.next;
            return ptr.value;
        } return null;
    }

    /*---------------------------------------------- Other ----------------------------------------------*/

    /*
     * 1: isValidPosition() method help you to determine if the given position is in range or not (* range validation *).
     * 2: capacity() method just return the number of elements ( nodes ) in your list.
     * 3: isEmpty() method return if the list contain at least element or not (* empty or not *).
     * 4: reverse() method doesn't take parameters and only reverse elements order in list.
     * */

    private boolean isValidPosition(int pos) {
        return pos >= 0 && pos <= ctr - 1;
    }

    public int capacity() {
        return ctr;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void reverse() {
        if (!isEmpty()) {
            Node cnt = tail = head;
            Node prv = null;
            Node nxt = cnt.next;
            while (nxt != null) {
                nxt = cnt.next;
                cnt.next = prv;
                prv = cnt;
                cnt = nxt;
            } head = prv;
        } else
            System.out.println("LinkedList is Underflow");
    }
}