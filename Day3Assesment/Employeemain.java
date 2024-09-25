public class Employeemain {
    public static void main(String[] args) {
        Permanentemployee peremp = new Permanentemployee(101,"Esther",2500,1500);
        peremp.calculateSalary();
        peremp.calculateBonus();
        System.out.println("Details of a permanentemployee:");
        peremp.displaydetails();

        Temporaryemployee temp = new Temporaryemployee(102,"Ganesh",1500,20);
        temp.calculateSalary();
        temp.calculateBonus();
        temp.displaydetails();
        System.out.println("details of a temporaryemployee:" );
        temp.displaydetails();

    }
}
