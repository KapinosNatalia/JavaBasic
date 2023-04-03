/*Задачи со звездочкой:
        1) Создать класс Human с полями: вес, возраст, пол, имя. Создать массив Human. Вывести толлько те объекты, которые
        имеют возраст больше 18 и вес меньше 80, если возраст меньше 18 вывести пол объекта
        2) Вывести только те объекты имя которых начинается с гласной буквы*/
public class Human {
    private double weight;
    private int age;
    private char gender;
    private String name;

    public Human(double weight, int age, char gender, String name) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void out() {
        System.out.println(name + ", " + age + " лет, " + weight + " кг");
    }

}
