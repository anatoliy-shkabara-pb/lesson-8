package s03throwsthrow;

import java.net.ConnectException;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
        //deposit(56);
    }

    public static void deposit(double amount) throws ConnectException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Argument amount must be positive");
        }

        Random random = new Random();
        boolean isConnectSuccessful = random.nextBoolean();

        if (!isConnectSuccessful) {
            throw new ConnectException("Error connection to deposit service");
        }

        System.out.println("Deposit " + amount + " successful!");
    }
}
