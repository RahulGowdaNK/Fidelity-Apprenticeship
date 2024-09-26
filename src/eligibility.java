import java.util.Scanner;

public class eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = sc.nextInt();

        if (Eligible(age)){
            System.out.println("Eligible to vote");

        }
        else{
            System.out.println("Not eligible to vote");
        }

    }


    private static boolean Eligible(int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }
    }

