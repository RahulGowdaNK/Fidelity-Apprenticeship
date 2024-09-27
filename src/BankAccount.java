class BankAccount {
    private String accountNumber;
    private double balance;


    public BankAccount(String accountNumber, double balance) {

        this.accountNumber = accountNumber;

        this.balance = balance;

    }
    public void performTransaction(int amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount);

        }
        else{
            System.out.println("invalid deposit amount.");
        }
        printAccountDetails();
    }

    public void performTransaction(int amount,boolean withdraw){
        if (withdraw) {
            if (amount >0 && amount <= balance) {
                balance = balance - amount;
                System.out.println("Withdrawn: " + amount);
            }
            else {
                System.out.println("Insufficient balance");

            }


            printAccountDetails();

        }


    }

    public void performTransaction(String fromAccount, String toAccount,int amount){
        if (fromAccount.equals(toAccount) && amount >0 && amount <=balance){
            balance = balance - amount;
            System.out.println("Transfered: " + amount + "from" + fromAccount + "to" + toAccount);
        }
        else{
            System.out.println("Insufficient balance");
        }
        printAccountDetails();
    }
    public void printAccountDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}





