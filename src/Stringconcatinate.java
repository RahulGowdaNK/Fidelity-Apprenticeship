import java.util.Scanner;

public class Stringconcatinate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  First name:");
        String firstName = sc.nextLine();

        System.out.println("Enter  Last name:");

        String lastName = sc.nextLine();

        String Fullname = String.join(" ", firstName, lastName);

        System.out.println(Fullname);
    }
}
