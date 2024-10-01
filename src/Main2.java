import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linkedlist3 list = new Linkedlist3();
        System.out.println("Enter the size of the Linkedlist");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter datafor node" + (i+1)+":");
            int data = sc.nextInt();
            list.insertathead(data);

        }
        System.out.println("Final linked list");
        list.display();
    }
}
