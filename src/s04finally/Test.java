package s04finally;

public class Test {

    public static void main(String[] args) {
        int array[] = new int[2];

        try {

            System.out.println("Доступ к третьему элементу:" + array[3]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Исключение:" + e);

        } finally {

            array[0] = 6;
            System.out.println("Значение первого элемента: " + array[0]);
            System.out.println("Оператор finally выполнен.");

        }
    }
}
