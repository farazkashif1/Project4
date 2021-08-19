public abstract class Employee {
    private String EmployeeName;
    private String EmployeeNumber;
    private String EmployeeAddress;
    public Employee(String EmployeeName,String EmployeeNumber,String EmployeeAddress){
        this.EmployeeName = EmployeeName;
        this.EmployeeNumber = EmployeeNumber;
        this.EmployeeAddress = EmployeeAddress;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public String getEmployeeNumber() {
        return EmployeeNumber;
    }

    public String getEmployeeAddress() {
        return EmployeeAddress;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public void setEmployeeNumber(String employeeNumber) {
        EmployeeNumber = employeeNumber;
    }

    public void setEmployeeAddress(String employeeAddress) {
        EmployeeAddress = employeeAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeName='" + EmployeeName + '\'' +
                ", EmployeeNumber='" + EmployeeNumber + '\'' +
                ", EmployeeAddress='" + EmployeeAddress + '\'' +
                '}';
    }

    public abstract void printEmployeeDetails();
}
