import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class Mainpersonaldetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        persondetails person =new persondetails();
        System.out.println("Enter the first name");
        person.setFirstname(sc.next());
        System.out.println("Enter the last name");
        person.setLastname(sc.next());
        System.out.println("Enter the date of birth");
        String date = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthdate = LocalDate.parse(date, formatter);
        person.setDateofbirth(birthdate);

        person.Displaydetails();
    }
}
