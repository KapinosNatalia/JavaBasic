import java.util.Scanner;

public class Main {
    // 1) Создать( декларировать) все примитивные типы как глобальные переменные
    byte globByte;
    short globShort;
    int globInt;
    long globLong;
    float globFloat;
    double globDouble;
    boolean globBoolean;
    char globChar;

    public static void main(String[] args) {
        //1) Создать( декларировать) все примитивные типы как локальные переменные
        byte locByte;
        short locShort;
        int locInt;
        long locLong;
        float locFloat;
        double locDouble;
        boolean locBoolean;
        char locChar;

        //2) Считать из консоли каждый примитивный тип и присвоить его переменной.
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число (byte, от -128 до 127):");
        locByte = sc.nextByte();
        System.out.print("Введите целое число (short):");
        locShort = sc.nextShort();
        System.out.print("Введите целое число (int):");
        locInt = sc.nextInt();
        System.out.print("Введите целое число (long):");
        locLong = sc.nextLong();
        System.out.print("Введите число с дробной частью (float):");
        locFloat = sc.nextFloat();
        System.out.print("Введите число с дробной частью (double):");
        locDouble = sc.nextDouble();
        System.out.print("Введите символ (char):");
        String str = sc.next();
        locChar = str.charAt(0);
        System.out.print("Введите число 1 или 0 (boolean):");
        byte a = sc.nextByte();
        if (a == 1) {
            locBoolean = true;
        } else {
            locBoolean = false;
        }
        //3) Вывести все типы в таблицу при помощи println() и printf()
        System.out.println("|----------|----------|----------|----------|----------|----------|----------|----------|");
        System.out.println("|---byte---|--short---|----int---|---long---|---float--|--double--|---char---|-boolean--|");
        System.out.printf("|%10d|%10d|%10d|%10d|%10.4f|%10.4f|%10s|%10s|\n",locByte,locShort,locInt,locLong,locFloat,locDouble,locChar,locBoolean);
        System.out.println("|----------|----------|----------|----------|----------|----------|----------|----------|");

    }
}