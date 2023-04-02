package Package1;

public class Class5 extends Class1{
    public Class5(int privateField, int defaultField, int protectedField, int publicField) {
        super(privateField, defaultField, protectedField, publicField);
    }

    public void printInfo() {
        Class5 objClass5 = new Class5(5,6,7,8);
        //System.out.println(objClass5.privateField); // ошибка, приватное поле не видно в другом классе
        System.out.println(objClass5.defaultField); // поле доступно, т.к. классы в одном пакете
        System.out.println(objClass5.protectedField); // поле доступно, т.к. это класс-наследник + тот же пакет
        System.out.println(objClass5.publicField); // поле доступно, т.к. оно публичное
    }
}
