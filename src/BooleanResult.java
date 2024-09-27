import java.util.Scanner;

public class BooleanResult {
    static boolean islessthan(int a, int b) {
        return (a < b);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        boolean result = islessthan(a, b);
        System.out.println( " The result of whether a is less than y is " +result);
    }
}
