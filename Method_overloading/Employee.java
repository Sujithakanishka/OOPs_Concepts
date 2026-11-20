package Method_overloading;

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
        System.out.println("name:"+name);
        System.out.println("Basic Salary:"+salary);
    }

    public void calculateSalary(int bonus)
    {
        System.out.println("Salary with Bonus:"+(salary+bonus));
    }

    public void calculateSalary(double bonus)
    {
        System.out.println("Salary with Decimal Bonus:"+(salary+bonus));
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }

    


}
