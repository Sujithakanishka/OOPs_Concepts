package One_perday.day1;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Arun", 22, 90);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getMarks());

        s1.setMarks(95);

        System.out.println(s1);
    }
}
