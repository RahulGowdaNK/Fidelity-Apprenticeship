
public class Main {
    public static void main(String[] args) {
        linkedlist1 list = new linkedlist1();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);
        list.insertAtIndex(1, 15);
        System.out.println("First element;" + list.getFirst());
        list.removeLast();
        list.removeLast();

        list.display();
        System.out.println("Size of list: " + list.getSize());
    }
}
