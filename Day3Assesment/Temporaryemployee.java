class Temporaryemployee extends Employee {
    int dailywages;
    int noofdaysworked;
    ;


    public Temporaryemployee(int employeeId, String employeeName, int dailywages, int noofdaysworked) {
        super(employeeId, employeeName, dailywages * noofdaysworked);
        this.dailywages = dailywages;
        this.noofdaysworked = noofdaysworked;

    }

    public void calculateSalary() {
        netsalary = dailywages * noofdaysworked;
    }

    public void calculateBonus() {
        if (dailywages < 1000) {
            bonus = 0.15f * netsalary;

        } else if (dailywages < 1000 && dailywages < 1500) {
            bonus = 0.12f * netsalary;
        } else if (dailywages >= 1500 && dailywages < 1700) {
            bonus = 0.11f * netsalary;
        } else {
            bonus = 0.08f * netsalary;
        }
    }

    public void displayDetails() {
        super.displaydetails();
        System.out.println("daily wages" + dailywages);
        System.out.println("no of days worked" + noofdaysworked);
        System.out.println("bonus" + bonus);
        System.out.println("netsalary" + netsalary);
    }
}



