package Method_overriding;

public class Main {
    public static void main(String[] args)
    {
        Employee employee=new Employee("Arun",25000.0);
        employee.calculateSalary();

        Manager manager=new Manager("Kumar",50000.0);
        manager.calculateSalary();
    }
    
}
