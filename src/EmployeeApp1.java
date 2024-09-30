

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeApp1 {
    public static Employee1 FindEmployeeById(List<Employee1> employees,int Id)throws Employeenotfound1{
        for (Employee1 emp : employees) {
            if (emp.getId() == Id){
                return emp;

            }
        }
        throw new Employeenotfound1("Employee with ID" + Id + " not found");

    }
    public static void main(String[] args) {
        List<Employee1> employeeList = new ArrayList<>();
        employeeList.add(new Employee1(1, "Rahul"));
        employeeList.add(new Employee1(2, "Rakesh"));
        employeeList.add(new Employee1(3, "Raju"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID to search");
        int searchId = scanner.nextInt();

        try {
            Employee1 foundEmployee = FindEmployeeById(employeeList, searchId);
            System.out.println("Employee found: " + foundEmployee.getName() + "ID" + foundEmployee.getId());
        }catch (Employeenotfound1 e) {
            System.out.println(e.getMessage());
        }
        finally {
            scanner.close();


        }

    }

}
