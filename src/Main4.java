import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Linkedlist4 list = new Linkedlist4();

        System.out.println("Enter intial linked list values: ");
        list.insertatposition(sc.nextInt(), 1);
        list.insertatposition(sc.nextInt(), 2);

        System.out.println("Enter the value to insert:");
        int value = sc.nextInt();
        System.out.println("Enter the position to insert: ");
        int position = sc.nextInt();
        list.insertatposition(value, position);
        System.out.println("Final linked list: ");
        list.display();
    }
}
