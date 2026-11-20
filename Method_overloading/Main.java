package Method_overloading;

public class Main {
    
    public static void main(String [] args)
    {

        Employee employee= new Employee("Arun",25000.0);
        employee.calculateSalary();
        employee.calculateSalary(5000);
        employee.calculateSalary(5000.0);
    }
}
