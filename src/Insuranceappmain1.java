import java.util.Scanner;

public class Insuranceappmain1{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the name of your insurance");
        String insureancename = SC.nextLine();
        System.out.println("Enter your insurance number");
        String insurancenum = SC.nextLine();
        System.out.println("Amountcovered; ");
        double amountCovered = SC.nextDouble();

        System.out.println("Select insurance type:");
        System.out.println("1.Life insurance");
        System.out.println("2.Motor insurance");
        int option = SC.nextInt();

        Insurance1 insurance ;

        if (option == 1) {
            System.out.println("PolicyTerm :");
            float policyTerm = SC.nextFloat();
            System.out.println("Benefit percentage: ");
            float benefitPercentage = SC.nextFloat();

            insurance = new Lifeinsurance1(insurancenum, insureancename, amountCovered, policyTerm, benefitPercentage);
        }else if (option == 2) {
            System.out.println("Deprecition percentage : ");
            float deprecitionPercentage = SC.nextFloat();
            insurance = new Motorinsurance1(deprecitionPercentage, insurancenum, insureancename, amountCovered);

        }

        else {
            System.out.println("Invalid selection :");
            return;

        }
        double premium = insurance.claculatePremium();
        System.out.println("Premium amount: " + premium);

    }
}

