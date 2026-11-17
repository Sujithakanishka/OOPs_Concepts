package One_perday.day1.focus_on_constructors;

public class Main {

    public static void main(String[] args) {
       Employee employee=new Employee(1,"Arun",25000);

        employee.displayDetails();
        double annual=employee.calculateAnnualSalary();
        System.out.println("Annaul salary :" + annual);

        System.out.println(employee);

    }
    
}
