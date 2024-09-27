

public class Accountdetails{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("12345", 1000);

        bankAccount.performTransaction(500);
        bankAccount.performTransaction(200, true);
        bankAccount.performTransaction("12345","67890",3000);
    }
}

