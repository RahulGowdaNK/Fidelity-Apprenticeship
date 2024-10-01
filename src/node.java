class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkedlist1 {
    private node head;
    private node tail;
    private int size;

    public linkedlist1() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    public void insertAtBeginning(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        node newNode = new node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Insert at a specific index
    public void insertAtIndex(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (index == 0) {
            insertAtBeginning(data);
            return;
        }

        if (index == size) {
            insertAtEnd(data);
            return;
        }

        node newNode = new node(data);
        node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }
    //get first element
    public int getFirst() {
        if (head == null) {
            return -1;
        }
        return head.data;
    }
    public void removeLast(){
        if (head == null) {
            return;
        }
        if (head == tail) {
            head=tail=null;
        }else{
            node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
        size --;
    }

    // Display the linked list
    public void display() {
        node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }
}

