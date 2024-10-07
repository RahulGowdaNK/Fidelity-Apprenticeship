import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Linkedlist linkedlist = new Linkedlist();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int numelements = scanner.nextInt();
        for (int i = 0; i < numelements; i++) {
            System.out.println(("Enter element: ")+(i+1)+";");
            int data=scanner.nextInt();
            linkedlist.append(data);
        }
        System.out.println("linked list is: ");
        linkedlist.display();

        System.out.println("Enter index to remove element: ");
        int index = scanner.nextInt();
        linkedlist.removeatindex(index);
        System.out.println("linked list after removal is: ");
        linkedlist.display();
    }
}
