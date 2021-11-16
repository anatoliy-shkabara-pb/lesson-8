package s06customexception;

/**
 * Исключение описывающее недостаток средств на банковском счету
 */
public class InsufficientFundsException extends Exception {

    private double amount;

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
