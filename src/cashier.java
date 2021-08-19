public class cashier extends Employee{
    private int cSalary;
    public cashier(int cSalary,String EmployeeName,String EmployeeNumber,String EmployeeAddress){
        super(EmployeeName, EmployeeNumber,EmployeeAddress);
        this.cSalary = cSalary;
    }

    public int getcSalary() {
        return cSalary;
    }

    @Override
    public String toString() {
        return  super.toString()+ "cashier{" +
                "cSalary=" + cSalary +
                '}';
    }

    @Override
    public void printEmployeeDetails(){
        System.out.println("Employee");
    }
}
