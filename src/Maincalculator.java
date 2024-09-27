import java.util.Scanner;

public class Maincalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculateprogram calculator =new Calculateprogram();

        System.out.println("Enter the first number");
        int first = sc.nextInt();
        System.out.println("Enter the second number");
        int second = sc.nextInt();


        System.out.println("Choose the operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = sc.nextInt();
        double result;
        double[] reaminder = new double[1];

        switch (choice) {
            case 1:
                result = calculator.Addition(first, second);
                System.out.println("The result is: " + result);

                break;
                case 2:
                    result= calculator.Subtraction(first, second);
                    System.out.println("The result is: " + result);
                    break;
                    case 3:
                        result= calculator.Multiplication(first, second);
                        System.out.println("The result is: " + result);
                        break;
                        case 4:
                            result = calculator.Division(first,second,reaminder);
                            if(second !=0){
                                System.out.println("The quotient is: "+result);
                                System.out.println("the reaminder is: "+reaminder[0]);

                            }
                            break;
                            default:


        }


    }
}
