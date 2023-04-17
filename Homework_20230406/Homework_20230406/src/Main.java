import java.util.Scanner;

public class Main {
    public static int value;
    public static void main(String[] args) {
        //1) Вывести числа от одного до десяти при помощи каждого цикла. Объяснить в чем удобство каждого цикла
        System.out.println("Цикл for:");
        // цикл удобен при "переборе" элементов массива или другой структуры данных,
        // где возможен доступ к элементу по индексу. В данном цикле не нужно следить за состоянием счетчика-индекса
        // в теле цикла.
        for (int i = 1; i<=10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nЦикл while:");
        // удобен для создания бесконечных циклов
        // для циклов, выполнение которых зависит от какого-то события, пока событие не наступило, цикл выполняется.
        int i = 1;
        while (i <= 10) {
            System.out.print(i++ + " ");
        }
        System.out.println("\n\nЦикл do while:");
        // удобен тем, что хотя бы одна итерация цикла будет выполнена вне зависимости от условия
        i = 1;
        do {
            System.out.print(i++ + " ");
        } while (i <= 10);

        //2) Сделать логический метод, который проверяет на равенство два числа
        System.out.println("\n");
        int num1 = 36;
        int num2 = 38;
        if (equal(num1, num2)) {
            System.out.println("Числа " + num1 + " и " + num2 + " равны");
        } else {
            System.out.println("Числа " + num1 + " и " + num2 + " не равны");
        }

        //3) Сделать процедуру для чтения с консоли значения в глобальную переменную
        System.out.println();
        readValue();

        //4) Сделать класс Cat с полями: age, weigth и name. Добавить конструктор для инициализации полей,
        // сделать методы акссессоры(геттеры и сеттеры) и метод out для вывода на консоль всех значений объекта.
        System.out.println("\nКоты:");

        //5) Создать объект класса Cat и показать работу всех его методов.
        Cat murzik = new Cat(2, 2, "Мурзик");
        Cat murka = new Cat(5, 3, "Мурка");
        murka.out();
        murka.setAge(7);
        murka.out();
        murzik.out();
        System.out.println("Вес " + murzik.getName() + ": " + murzik.getWeight() + " кг");
        System.out.printf("Вес %S: %5.2f кг", murzik.getName(), murzik.getWeight());
    }

    public static boolean equal(int num1, int num2) {
        if (num1 == num2) {
            return true;
        } else {
            return false;
        }
    }

    public static void readValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");
        value = scanner.nextInt();
    }

}
