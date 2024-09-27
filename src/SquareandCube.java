import java.util.Scanner;

public class SquareandCube {
    static double Findsquare(double num) {
        return num*num;
    }
    static double Findcube(double num) {
        return num*num*num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        double num = sc.nextDouble();

        System.out.println("Square of " + num + " is " + Findsquare(num));
        System.out.println("Cube of " + num + " is " + Findcube(num));

    }
}
