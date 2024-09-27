class insufficientbalanceException extends Exception {
    public insufficientbalanceException(String message) {
        super(message);

    }
}
class Bankaccount{
    private double balance;
    public Bankaccount(double balance) {
        this.balance = balance;

    }
    public void withdraw(double amount) throws insufficientbalanceException {
        if ( amount > balance ) {
            throw new insufficientbalanceException("Insufficient balance");

        }
        balance -= amount;
        System.out.println("Withdrawal successful" + " " + "Balance is" + balance);

    }
}