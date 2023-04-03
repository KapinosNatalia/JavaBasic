import java.util.ArrayList;
import java.util.Scanner;

/*Задачи со звездочкой:
        1) Создать класс Human с полями: вес, возраст, пол, имя. Создать массив Human. Вывести толлько те объекты, которые
        имеют возраст больше 18 и вес меньше 80, если возраст меньше 18 вывести пол объекта
        2) Вывести только те объекты имя которых начинается с гласной буквы
        3) Создать класс - точку на отрезке, создать массив точек, вывести только те точки, которые принадлежат интервалу 5-10*/
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Human[] humans = new Human[4];
        humans[0] = new Human(56, 30, 'w', "Olga");
        humans[1] = new Human(96, 65, 'm', "Ivan");
        humans[2] = new Human(35, 12, 'w', "Alina");
        humans[3] = new Human(80, 36, 'm', "Petr");
        processArrayHumans(humans, 18, 80);

        Point[] points = new Point[5];
        points[0] = new Point(2);
        points[1] = new Point(5);
        points[2] = new Point(9);
        points[3] = new Point(35);
        points[4] = new Point(80);
        processArrayPoints(points, 5, 10);

        startCalculation();

        /*Создать метод, в котором будем спрашивать возраст.
        Создать еще три метода для возрастных групп: до 18, от 18 до 40 от 40.
        В первом методе спросить в какие игры играет человек
        Во втором спросить сколько человек зарабатывает
        В третьем спросить есть ли у человека автомобиль*/
        askAge();

    }

    public static void askAge() {
        System.out.println("Введите возраст:");
        int age = sc.nextInt();
        if (age < 18) {
            askGame();
        } else if (age >= 18 && age < 40) {
            askSalary();
        } else {
            askCar();
        }
    }

    public static void askGame() {
        System.out.println("В какие игры ты играешь?");
        String game = sc.next();
        System.out.println("Игры: " + game);
    }
    public static void askSalary() {
        System.out.println("Сколько Вы зарабатываете?");
        int salary = sc.nextInt();
        System.out.println("Зарплата: " + salary);
    }
    public static void askCar(){
        System.out.println("Есть ли у Вас автомобиль (да/нет)?");
        String car = sc.next();
        boolean existCar;
        if (car.equals("да")) {
            existCar = true;
        }
        else {
            existCar = false;
        }
        // проверим, что переменная заполнилась правильно
        if (existCar) {
        System.out.println("Машина есть");
        } else {
            System.out.println("Машины нет");
        }
    }

    public static void processArrayHumans(Human[] humans, int age, double weight) {
        // создадим массивы неопределенной длины, google помог
        ArrayList<Human> arrayHumans1 = new ArrayList<>(); // возраст больше 18 и вес меньше 80
        ArrayList<Human> arrayHumans2 = new ArrayList<>(); // возраст меньше 18
        ArrayList<Human> arrayHumans3 = new ArrayList<>(); // имя начинается с гласной буквы

        for (int i = 0; i < humans.length; i++) {
            if (humans[i].getAge() > age && humans[i].getWeight() < weight) {
                arrayHumans1.add(humans[i]);
            } else if (humans[i].getAge() < 18) {
                arrayHumans2.add(humans[i]);
            }
            /* google помог:
            ^ обозначает начало строки
            (?i:...) - включает CASE_INSENSITIVE для этой группы, чтобы не перечислять повторно заглавные буквы.
            (?ui:...) Важно! Если вы работаете с юникодом, то вышеуказанный ключ не сработает. Нужно добавить UNICODE_CASE, т.е. ?ui.
            [aeiouy] - все гласные. Если нужно найти все согласные, то нельзя использовать [^aeiouy],
                       т.к. в эту группу попадают вообще все символы юникода, кроме этих шести. Нужно точно так же перечислить согласные.
            .* - дальше сколько угодно (хоть ноль) любых символов, кроме конца строки.*/
            if (humans[i].getName().matches("^(?i:[aeiouy]).*")) {
                arrayHumans3.add(humans[i]);
            }
        }

        System.out.println("Совершеннолетние с весом меньше 80 кг:");
        for (int i = 0; i < arrayHumans1.size(); i++) {
            arrayHumans1.get(i).out();
        }
        System.out.println("Несовершеннолетние:");
        for (int i = 0; i < arrayHumans2.size(); i++) {
            arrayHumans2.get(i).out();
        }
        System.out.println("Имя начинается с гласной:");
        for (int i = 0; i < arrayHumans3.size(); i++) {
            arrayHumans3.get(i).out();
        }
    }

    public static void processArrayPoints(Point[] points, int min, int max) {
        System.out.println("Точки в интервале [" + min + ", " + max + "]");
        for (Point point : points)
        {
            if (point.getX() >= min && point.getX() <= max)
            {
                point.out();
            }
        }
    }
    public static void startCalculation(){
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();
        System.out.println("Введите операцию:");
        char sign = sc.next().charAt(0);
        if (sign == '+') {
            sum(a, b);
        } else if (sign == '-') {
            sub(a, b);
        } else if (sign == '/') {
            div(a, b);
        } else {
            mul(a, b);
        }
    }
    public static void sum(int a, int b){
        int sum = a + b;
        System.out.println("Сумма: " + sum);
    }
    public static void sub(int a, int b){
        int sub = a - b;
        System.out.println("Разность: " + sub);
    }
    public static void div(int a, int b){
        double div = a / b;
        System.out.println("Результат деления: " + div);
    }
    public static void mul(int a, int b){
        int mul = a * b;
        System.out.println("Произведение: " + mul);
    }


}