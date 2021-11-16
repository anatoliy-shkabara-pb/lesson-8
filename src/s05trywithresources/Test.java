package s05trywithresources;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {
        FileReader fr = null;
        try {

            File f = new File("file.txt");
            fr = new FileReader(f);
            char[] array = new char[10];
            fr.read(array);   // чтение содержимого массива

            for (char c : array) {
                System.out.print(c);   // вывод символов на экран, один за одним
            }

        } catch (IOException e1) {

            e1.printStackTrace();

        } finally {
            try {
                fr.close();
            } catch (NullPointerException | IOException e2) {
                System.out.println("Catch in finally");
                e2.printStackTrace();
            }
        }
    }
}
