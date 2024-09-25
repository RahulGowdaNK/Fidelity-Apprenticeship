class Permanentemployee extends Employee {
    int pf;

    public Permanentemployee(int employeeid, String employeeName,float basicsalary,int pf){
        super(employeeid,employeeName,basicsalary);
        this.pf = pf;

    }
    public void calculateSalary(){
        netsalary=basicsalary-pf;

    }
    public void calculateBonus(){
        if (pf< 1000) {
            bonus=0.1f*basicsalary;

        }
        else if(pf>=1000 && pf <1500){
            bonus=0.115f*basicsalary;

        }
        else if(pf>=1500 && pf <1800){
            bonus=0.12f*basicsalary;

        }
        else {
            bonus=0.15f*basicsalary;
        }
    }
    public void displaydetails(){
        super.displaydetails();
        System.out.println("pf:"+pf);
        System.out.println("bonous" +bonus);
        System.out.println();
    }

}
