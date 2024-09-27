public class Mainexception {
    public static void main(String[] args) {
        Bankaccount account =new Bankaccount(1000);
        try{
            account.withdraw(100);

        }
        catch(insufficientbalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
