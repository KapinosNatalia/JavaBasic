public class Main {
    public static void main(String[] args) {
        // 1) Создать класс Car c приватными полями, двумя конструкторами, aксессорами для полей и методом(процедурой)
        // out для вывода всех полей класс на консоль
        Car bmw = new Car("BMW", "X5", "красный", 3, 83300f, 2022);
        Car audi = new Car("Audi", "Q5", 50000);
        bmw.out();
        audi.out();
        audi.setYear(2023);
        if (audi.getColor() == "") {
            audi.setColor("зеленый");
        }
        audi.out();

        // 2) Создать статические(static) методы для решения основных арифметических операций: +, -, *, /
        System.out.println("Операция сложения: 25.45 + 15.08 = " + MathOperations.add(25.45, 15.08));
        System.out.println("Операция вычитания: 25.45 - 15.08 = " + MathOperations.sub(25.45, 15.08));
        System.out.println("Операция умножения: 25.45 * 15.08 = " + MathOperations.mult(25.45, 15.08));
        System.out.println("Операция деления: 25.45 / 15.08 = " + MathOperations.dev(25.45, 15.08));

        // 3) Создать логические методы, которые будут проверять условия для переданных в них 3 переменных:
        // a) первая переменная больше двух остальных;
        System.out.println("первая переменная больше двух остальных:");
        System.out.println(MathOperations.firstIsMoreThenOthers(6,2,3)); // true
        System.out.println(MathOperations.firstIsMoreThenOthers(6,9,3)); // false
        // b) первая переменная больше хотя бы одной переменной;
        System.out.println("первая переменная больше хотя бы одной переменной:");
        System.out.println(MathOperations.firstIsMoreThenOneOfOthers(6,2,3)); // true
        System.out.println(MathOperations.firstIsMoreThenOneOfOthers(6,9,3)); // true
        System.out.println(MathOperations.firstIsMoreThenOneOfOthers(6,9,8)); // false
        // c) первая переменная больше только одной переменной.
        System.out.println("первая переменная больше только одной переменной:");
        System.out.println(MathOperations.firstIsMoreThenOnlyOneOfOthers(6,2,3)); // false
        System.out.println(MathOperations.firstIsMoreThenOnlyOneOfOthers(6,9,3)); // true
        System.out.println(MathOperations.firstIsMoreThenOnlyOneOfOthers(6,9,8)); // false
    }
}
