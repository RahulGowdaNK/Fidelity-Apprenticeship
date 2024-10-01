import java.util.Scanner;

public class reversemain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reverse reverse = new Reverse();
        System.out.println("Enter the number elements  to be reversed: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("enter the element" + (i+1) + ": ");
            int data = sc.nextInt();
            reverse.insertattail(data);

        }
        System.out.println("The reverse of the elements is: ");
        reverse.display();
    }
}
