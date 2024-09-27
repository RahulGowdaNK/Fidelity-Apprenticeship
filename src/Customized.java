class CustomException extends Exception {
    private int Errorcode;
    private String Errormessage;

    public CustomException(int Errorcode, String Errormessage) {
        this.Errorcode = Errorcode;
        this.Errormessage = Errormessage;

    }
    public int getErrorCode() {
        return Errorcode;

    }
    public String getErrormessage() {
        return Errormessage;

    }
}
class Validator{
    public void validateage(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException(101, "Invalid age");

        }
        else {
            System.out.println("Valid age");

        }
    }
}
