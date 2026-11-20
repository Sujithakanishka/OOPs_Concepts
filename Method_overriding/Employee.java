package Method_overriding;

public class Employee {
    private String name;
    private double salary;

    public Employee()
    {

    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary>0)
        {
        this.salary = salary;
        }
    }

    public void calculateSalary()
    {
        System.out.println("Name:"+name);
        System.out.println("Basic salary:"+salary);
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }

    
}
