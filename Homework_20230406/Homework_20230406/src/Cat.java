//4) Сделать класс Cat с полями: age, weigth и name. Добавить конструктор для инициализации полей,
// сделать методы акссессоры(геттеры и сеттеры) и метод out для вывода на консоль всех значений объекта.
public class Cat {
    private int age;
    private double weight;
    private String name;

    public Cat(int age, double weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void out() {
        System.out.println("Кот/кошка по имени " + name + " возрастом " + age + " лет и весом " + weight + " кг");
    }
}
