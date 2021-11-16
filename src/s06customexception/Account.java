package s06customexception;

/**
 * Счет в банке
 */
public class Account {

    private int number;
    private double balance;

    public Account(int number) {
        this.number = number;
    }

    /**
     * Пополнение счета
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Снятие со счета
     */
    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount <= balance) {
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }
}
