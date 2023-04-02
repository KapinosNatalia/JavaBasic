package Package1;

public class Class2 {
    public void printFields() {
        Class1 objClass1 = new Class1(1,2,3,4);
        System.out.println("Видимость полей из другого класса в том же пакете:");
        //System.out.println(objClass1.privateField); // Ошибка, "приватное" поле не видно в другом классе
        // Остальные поля видны
        System.out.println(objClass1.defaultField);
        System.out.println(objClass1.protectedField);
        System.out.println(objClass1.publicField);
    }

}
