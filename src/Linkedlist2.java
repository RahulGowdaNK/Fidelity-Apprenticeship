class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Linkedlist2{
    Node head;

    public void insertattail(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;

        }else{
            Node Last = head;
            while(Last.next != null){
                Last = Last.next;
            }
            Last.next = newNode;
        }
    }
    public void Display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

