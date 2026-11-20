package One_perday.day1.encapsulation_and_rules;

public class Main {
    public static void main(String[] args) {

        BankAccount account =
            new BankAccount("Arun", "ACC101", 5000);

        System.out.println("Initial Account Details:");
        System.out.println(account);

        System.out.println("\nDepositing money:");
        account.deposit(2000);

        System.out.println("\nWithdrawing money:");
        account.withdraw(1000);

        System.out.println("\nTrying insufficient withdrawal:");
        account.withdraw(10000);

        System.out.println("\nTrying invalid deposit:");
        account.deposit(-500);

        System.out.println("\nFinal Account Details:");
        System.out.println(account);
    }
}