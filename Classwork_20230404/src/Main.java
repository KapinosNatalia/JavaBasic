import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        /*Каждому сделать свой switch c несколькими условиями и вызовом методов в зависимости от условия.
        Условия и методы придумать самостоятельно*/
        //translate();2

        //calculate();

        RockPaperScissors.startGame();

        //printOutWithStep(25, 3);

        //1) Показать цикл while в методе, выводящий числа кратные 7 от нуля до заданного диапазона
        //printOutWithStep(100, 7);

        /*Задача
        Чатбот на минималках
        В бесконечном цикле в метод поступают слова(String): Привет, Как дела?, Пока
        Ответ бота: Привет -> Здравствуйте!, Как дела -> Все отлично. Хотите ли еще что-нибудь узнать? Пока -> Хорошего дня
        При вводе Пока, выходим из приложения.
        Подсказка: Для сравнения строк использовать метод equals, например:
        String str;
        str.equals("Привет")  проверит равна ли строка Привет
                Решение
        1) Создать переменную для слов пользователя и переменную для слов бота
        2) Создать бесконечный цикл while и выходить из него при вводе слова  Пока - использовать break или return
                3) Создать метод(функцию) типа String, которая будет возвращать ответ бота, она должна принимать введенную переменную
        4) Вывести ответ.*/

        //chatBot();


    }

    public static void chatBot() {
        String question;
        String answer;
        System.out.println("Вас приветсвует ЧатБот");
        while (true) {
            question = sc.nextLine();
            if (question.equals("Пока"))
            {
                System.out.println("Хорошего дня");
                return;
            } else {
                System.out.println(getAnswer(question));
            }
        }
    }

    public static String getAnswer(String question) {
        if (question.equals("Привет"))
        {
            return "Здравствуйте!";
        } else if (question.equals("Как дела?"))
        {
            return "Все отлично. Хотите ли еще что-нибудь узнать?";
        } else {
            return "Я Вас не понимаю";
        }
    }
    public static void printOutWithStep(int max, int step){
        int count = 0;
        while (count <= max) {
            System.out.println(count);
            count = count + step;
        }
    }
    public static void calculate() {
        while (true) {
            System.out.print("Введите первое число:");
            int num1 = sc.nextInt();
            System.out.print("Введите второе число:");
            int num2 = sc.nextInt();
            System.out.print("Введите математическую операцию:");
            char sign = sc.next().charAt(0);
            double result = -1;
            switch (sign) {
                case '+':
                    result = sum(num1, num2);
                    break;
                case '-':
                    result = sub(num1, num2);
                    break;
                case '*':
                    result = mul(num1, num2);
                    break;
                case '/':
                    result = div(num1, num2);
                    break;
            }
            System.out.println(result);

            System.out.println("Желаете выйти?\n Да - y\nНет - n\n");
            char exit = sc.next().charAt(0);
            if (exit == 'y') {
                return;
            }

        }
    }

    public static double sum(int num1, int num2) {
        return num1 + num2;
    }
    public static double sub(int num1, int num2) {
        return num1 - num2;
    }
    public static double mul(int num1, int num2) {
        return num1 * num2;
    }
    public static double div(int num1, int num2) {
        return num1 / num2;
    }
    public static void translate() {
        System.out.print("Введите название животного на английском:");
        String animalEng = sc.next();
        //System.out.print(animalEng);
        switch (animalEng) {
            case "cat":
                printThisIsCat();
                break;
            case "dog":
                printThisIsDog();
                break;
            case "fish":
                printThisIsFish();
                break;
            default:
                printIDontKnow();
        }
    }
    public static void printThisIsCat() {
        System.out.println("Кот");
    }
    public static void printThisIsDog() {
        System.out.println("Собака");
    }
    public static void printThisIsFish() {
        System.out.println("Рыба");
    }
    public static void printIDontKnow() {
        System.out.println("Животное неопределено");
    }

}
