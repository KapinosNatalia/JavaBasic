public class Homework_20230328 {
    public static void main(String[] args) {
        // ДЗ от 27.03.2023
        // 1)Организовать генерацию случайных значений всех примитивных типов
        // Math.random() * (b - a + 1) + a

        byte randomByte = (byte) (Math.random()*(127+128+1)-128);
        System.out.println("random byte:" + randomByte);
        short randomShort = (short) (Math.random()*(32767+32768+1)-32768);
        System.out.println("random short:" + randomShort);
        int randomInt = (int) (Math.random()*((Math.pow(2,31)-1)+Math.pow(2,31)+1)-Math.pow(2,31));
        System.out.println("random int:" + randomInt);
        long randomLong = (long) (Math.random()*((Math.pow(2,63)-1)+Math.pow(2,63)+1)-Math.pow(2,63));
        System.out.println("random long:" + randomLong);
        //float randomFloat = (float) (Math.random()*(2*3.4E+38+1)-3.4E+38);
        float randomFloat = (float) (Math.random()*(Float.MAX_VALUE - Float.MIN_VALUE +1) + Float.MIN_VALUE);
        System.out.println("random float:" + randomFloat);
        //double randomDouble = (double) (Math.random()*(2*1.7E+308)-1.7E+308);
        //System.out.println(Double.MIN_VALUE);
        double randomDouble = (double) (Math.random()*(Double.MAX_VALUE - Double.MIN_VALUE +1) + Double.MIN_VALUE);
        System.out.println("random double:" + randomDouble);
        char randomChar = (char) (Math.random()*65535);
        System.out.println("random char:" + randomChar);
        boolean randomBool;
        if ((byte) (Math.random()*2) == 1) {
            randomBool = true;
        } else {
            randomBool = false;
        }
        System.out.println("random boolean:" + randomBool);


        // 2) Показать работу со строками(вызвать как можно больше методов класса String)
        String str = "Длинная тестовая строка";
        String str1 = new String(new char[] {'о','ч','е','н','ь',' '});
        /*if (str1.toCharArray() == new char[] {'о','ч','е','н','ь'}) {
            System.out.println("Массивы символов равны");
        } else {
            System.out.println("Массивы символов не равны");
            System.out.println(str1);
            System.out.println(str1.toCharArray());
            System.out.println(new char[] {'о','ч','е','н','ь'});
        }*/
        System.out.println(str1.concat(str).toUpperCase());
        System.out.println(str1.concat(str).toUpperCase().replace("ДЛИННАЯ","короткая"));
        System.out.println(str.equals("Длинная тестовая строка"));
        System.out.println(str.equalsIgnoreCase("длиннАЯ ТЕСтоваЯ СтрОКА"));
        System.out.println(str.indexOf('о',16));
        System.out.println(str.substring(7,17).trim());

        // ДЗ от 28.03.2023
        // 1) Создать методы(функции), которые будут возвращать сумму, произведение, частное и разность переменных типа double
        System.out.println(sum(25.25, 15.15));
        System.out.println(mult(25.25, 15.15));
        System.out.println(div(25.25, 15.15));
        System.out.println(sub(25.25, 15.15));

        // 2) Создать класс Car, в котором будет конструктор и метод(процедура) для вывода значения полей класса
        Car oldCar = new Car("BMW", "E30", "silber", 1.8f, 1500, 1984);
        oldCar.printInfo();

        // 3) Создать методы процедуры, которые будут выводить на консоль: "Я люблю Java" и "Учить программирование весело"
        printILoveJava();
        printLearningIsFun();
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double mult(double num1, double num2) {
        return num1 * num2;
    }

    public static double div(double num1, double num2) {
        return num1 / num2;
    }

    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    public static void printILoveJava(){
        System.out.println("Я люблю Java");
    }
    public static void printLearningIsFun(){
        System.out.println("Учить программирование весело");
    }
}
