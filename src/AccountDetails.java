public class AccountDetails {
    private int accNo;
    private String accName;
    private double balance;
    public AccountDetails(int accNo, String accName, double balance) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = balance;

    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited " + amount + " to the account " + accName);

        }
        else {
            System.out.println("You can't deposit a negative amount to the account " + accName);

        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && balance <= amount) {
            balance -= amount;
            System.out.println("Successfully withdrawn " + amount + " to the account " + accName);

        } else {
            System.out.println("You can't withdraw a negative amount to the account " + accName);

        }

    }
    public void CheckBalnace(){
        System.out.println(  "Accountholder" + accName + "Account " + accNo + " has balance " + balance);



    }
    public static void main(String[] args) {
        AccountDetails accountDetails = new AccountDetails(12345, "John Smith", 10.0);

        accountDetails.CheckBalnace();
        accountDetails.deposit(5.0);
        accountDetails.withdraw(5.0);
        accountDetails.CheckBalnace();

    }
}
