import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class persondetails {
    private String firstname;
    private String lastname;
    private LocalDate dateofbirth;

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;

    }
    public String getLastname() {
        return lastname;

    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public LocalDate getDateofbirth() {
        return dateofbirth;

    }
    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
    public String getAdult(){
        int age =getAge(dateofbirth);
        if (age >= 18){
            return "Adult";
        }
        else{
            return "Child";
        }
    }
    public int getAge(LocalDate dateofbirth){
        LocalDate currentdate = LocalDate.now();
        if ((dateofbirth.compareTo(currentdate) == 0)){
            return 0;

        }
        else{
            return dateofbirth.compareTo(currentdate);

        }
    }
    public void Displaydetails(){
        System.out.println("Firstname: " + firstname);
        System.out.println("Lastname: " + lastname);
        System.out.println("Dateofbirth: " + dateofbirth);
        System.out.println("Age: " + getAge(dateofbirth));
        System.out.println("staus:" + getAdult());

    }





}

