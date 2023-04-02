package Package2;

import Package1.Class1;

public class Class3 extends Class1{
    // Вопрос: почему-то пока не создала конструктор, объявление класса подчеркивалось красным, почему?
    public Class3(int privateField, int defaultField, int protectedField, int publicField) {
        super(privateField, defaultField, protectedField, publicField);
    }

    public void printFields() {
        Class1 objClass1 = new Class1(1,2,3,4);
        //System.out.println("Видимость полей класса-родителя из класса-наследника в другом пакете:");
        //System.out.println(objClass1.privateField); // ошибка, приватное поле
        //System.out.println(objClass1.defaultField); // ошибка, другой пакет
        //System.out.println(objClass1.protectedField); // ошибка, не пойму, почему?
        System.out.println(objClass1.publicField); //

        Class3 objClass3 = new Class3(1,2,3,4);
        System.out.println("Видимость полей класса-родителя из класса-наследника в другом пакете:");
        //System.out.println(objClass3.privateField); // ошибка, приватное поле
        //System.out.println(objClass3.defaultField); // ошибка, другой пакет
        System.out.println(objClass3.protectedField); // поля protected и public видны в классе-наследнике
        System.out.println(objClass3.publicField); //

        //System.out.println(super.privateField); // Ошибка, "приватное" поле не видно нигде, кроме своего класса
        //System.out.println(super.defaultField); // Ошибка, поле "default" видно только в классах одного пакета
        // Остальные поля видны
        System.out.println(this.protectedField); // Поле "protected" видно в наследнике
        System.out.println(super.protectedField);
        System.out.println(super.publicField);

    }
}
