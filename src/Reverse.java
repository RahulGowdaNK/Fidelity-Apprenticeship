class node4{
    int data;
    node4 next;

    node4(int data){
        this.data = data;
        this.next = null;

    }
}
class Reverse {
    node4 head;

    public void insertattail(int data) {
        node4 newNODE = new node4(data);
        if (head == null) {
            head = newNODE;

        } else {
            node4 last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNODE;
        }
    }
    public void ReversE() {
        node4 prev = null;
        node4 current = head;
        node4 next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        head = prev;

    }
    public void display() {
        node4 current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;

        }
        System.out.println();
    }
}
