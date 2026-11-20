package focus_on_inheritance;
public class Employee extends Person{
    private int employeeId;
    private double salary;

    public Employee()
    {

    }

    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployeeDetails()
    {
        super.displayPersonDetails();
        System.out.println("EmployeeId:"+employeeId+ "Salary:"+salary);
    }

    @Override
    public String toString() {
        return super.toString() +
           ", employeeId=" + employeeId +
           ", salary=" + salary;
    }
    
}
