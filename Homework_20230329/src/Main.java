// Homework_20230329

/* 1) Создать класс Animal c полями: age, weight, name, id реализовать автогенерацию id, добавить метод(процедуру) для
     вывода полей объекта
   2)* Показать работу модификаторов доступа         */

public class Main {
    public static void main(String[] args) {
        /*1) Создать класс Animal c полями: age, weight, name, id реализовать автогенерацию id, добавить метод(процедуру) для
        вывода полей объекта */
        Animal cat = new Animal(12, 3.5,"Cat");
        Animal fish = new Animal(2, 0.05,"Fish");
        Animal hamster = new Animal(4, 0.105,"Hamster");
        cat.out();
        fish.out();
        hamster.out();
    }
}
