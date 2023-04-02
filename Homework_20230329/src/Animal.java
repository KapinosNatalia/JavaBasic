/*1) Создать класс Animal c полями: age, weight, name, id реализовать автогенерацию id, добавить метод(процедуру) для
     вывода полей объекта */
public class Animal {
    private int age;
    private double weight;
    private String name;
    private int id;

    private static int ident = 1;

    public Animal(int age, double weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.id = ident;

        ident++;
    }
    public void out(){
        System.out.println("Уникальный идентификатор животного: " + id + "\n" +
                "Название животного: " + name + "\n" +
                "Вес животного: " + weight + "\n" +
                "Возраст животного: " + age);
    }
}
