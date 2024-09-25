class Employee {
    int employeeId;
    String employeeName;
    float basicsalary;
    float bonus;
    float netsalary;

    public Employee(int employeeId, String employeeName, float basicsalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicsalary = basicsalary;

    }
    public void displaydetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basicsalary: " + basicsalary);
    }

}