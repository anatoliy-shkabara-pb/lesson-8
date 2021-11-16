package s02traycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ManyCatchTest {

    public static void main(String[] args) {
        FileInputStream file;
        String fileName = "test.txt";
        byte x;

        try {

            file = new FileInputStream(fileName);
            x = (byte) file.read();
            System.out.println("Данные: " + x);

        } catch (FileNotFoundException e2) {

            System.out.println("Блок e2");
            e2.printStackTrace();

        } catch (IOException e1) {

            System.out.println("Блок e1");
            e1.printStackTrace();
        }
    }
}
