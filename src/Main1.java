import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linkedlist2 list = new Linkedlist2();

        System.out.println("Enter the size of the Linkedlist");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter data for node" +(i+1)+":");
            int data = sc.nextInt();
            list.insertattail(data);
        }
        System.out.println("final linked list:");
        list.Display();

    }
}
