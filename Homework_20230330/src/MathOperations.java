public class MathOperations {
    // 2) Создать статические(static) методы для решения основных арифметических операций: +, -, *, /
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    public static double sub(double num1, double num2) {
        return num1 - num2;
    }
    public static double mult(double num1, double num2) {
        return num1 * num2;
    }
    public static double dev(double num1, double num2) {
        return num1 / num2;
    }

    // 3) Создать логические методы, которые будут проверять условия для переданных в них 3 переменных:
    // a) первая переменная больше двух остальных;
    public static boolean firstIsMoreThenOthers(int num1, int num2, int num3) {
        return (num1 > num2) && (num1 > num3);
    }
    // b) первая переменная больше хотя бы одной переменной;
    public static boolean firstIsMoreThenOneOfOthers(int num1, int num2, int num3) {
        return (num1 > num2) || (num1 > num3);
    }
    // c) первая переменная больше только одной переменной.
    public static boolean firstIsMoreThenOnlyOneOfOthers(int num1, int num2, int num3) {
        return (num1 > num2) ^ (num1 > num3);
    }
}
