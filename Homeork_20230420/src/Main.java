public class Main {
    //Сделать класс для управления массивом из 10 элементов. Реализовать операции: вставка, удаление, сортировка, поиск, вывод в строку.
    public static void main(String[] args) {
        MyArrayInt arrayInt = new MyArrayInt();
        arrayInt.add(3);
        arrayInt.add(1);
        arrayInt.add(15);
        System.out.println(arrayInt.toString());

        arrayInt.insert(-2, 5);
        System.out.println(arrayInt.toString());

        arrayInt.insert(8);
        System.out.println(arrayInt.toString());

        arrayInt.insert(-4, 5);
        System.out.println(arrayInt.toString());

        arrayInt.sort();
        System.out.println(arrayInt.toString());

        System.out.println(arrayInt.find(-4));

        arrayInt.deleteByIndex(2);
        System.out.println(arrayInt.toString());
    }

}
