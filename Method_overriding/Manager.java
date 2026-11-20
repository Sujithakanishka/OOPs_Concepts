package Method_overriding;

public class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Name: " + getName());
        System.out.println("Manager Total Salary: " + (getSalary() + 10000));
    }
}