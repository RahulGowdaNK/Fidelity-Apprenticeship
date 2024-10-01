class node1{
    int data;
    node1 next;

    node1(int d){
        this.data = d;
        this.next = null;

    }
}
class Linkedlist3 {
    node1 head;

    public void insertathead(int data){
        node1 newnode = new node1(data);
        newnode.next = head;
        head = newnode;

    }
    public void display(){
        node1 current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
}
