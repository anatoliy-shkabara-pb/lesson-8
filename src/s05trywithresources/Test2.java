package s05trywithresources;

import java.io.FileReader;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("/test/file.txt")) {

            char[] array = new char[10];
            // чтение содержимого массива
            fr.read(array);

            for (char c : array) {
                // вывод символов на экран, один за одним
                System.out.print(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
