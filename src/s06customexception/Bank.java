package s06customexception;

public class Bank {

    public static void main(String[] args) {
        Account account = new Account(101);

        System.out.println("Депозит $300...");
        account.deposit(300.00);

        try {
            System.out.println("\nСнятие $100...");
            account.withdraw(100.00);
            System.out.println("Снятие $100 - ok");

            System.out.println("\nСнятие $400...");
            account.withdraw(400.00);

        } catch (InsufficientFundsException e) {
            System.out.println("Извините, но у Вас $" + e.getAmount());
            e.printStackTrace();
        }
    }
}
