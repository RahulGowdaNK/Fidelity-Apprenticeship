public class Maincustomexception {
    public static void main(String[] args) {
        Validator validator = new Validator();
        try{
            validator.validateage(45);

        }
        catch(Exception e){
            System.out.println("Error code: " + e.getMessage());
            System.out.println("Error message: " + e.getMessage());
        }
    }
}
