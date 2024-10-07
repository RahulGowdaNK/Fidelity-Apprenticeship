class Linkedlist {
    Node head;

    void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;

        }else{
            Node current = head;
            while(current.next != null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    void removeatindex(int index){
        if(index == 0 ||index >=length()){
            System.out.println("Invid index");
            return;
        }
        if (index==0){
            head=head.next;
            return;
        }
        Node current = head;
        for(int i=0;i<index-1;i++){
            current=current.next;
        }
        current.next=current.next.next;
    }
    int length(){
        int count = 0;
        Node current = head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    void display(){
        Node current = head;
        while(current!=null){
            System.out.println(current.data+"");
            current=current.next;
        }
        System.out.println();
    }


}