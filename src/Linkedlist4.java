class node2{
    int data;
    node2 next;

    node2(int data){
        this.data = data;
        this.next = null;
    }
}
class Linkedlist4{
    node2 head;

    public void insertatposition(int data, int position){
        node2 newnode = new node2(data);
        if(position == 1){
            newnode.next = head;
            head = newnode;
            return;

        }
        node2 current = head;
        for(int i = 1; i < position-1 && current !=null; i++){
            current = current.next;

        }
        if (current != null){
            newnode.next = current.next;
            current.next = newnode;
        }else{
            System.out.println("Position out of bounds");
        }
    }
    public void display(){
        node2 current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;

        }
        System.out.println();
    }
}
