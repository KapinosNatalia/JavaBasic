package Package2;

import Package1.Class1;

public class Class4 {
    public void printFields() {
        Class1 objClass1 = new Class1(1,2,3,4);
        System.out.println("Видимость полей из другого класса в другом пакете:");
        //System.out.println(objClass1.privateField); // Видно только публичные поля
        //System.out.println(objClass1.defaultField);
        //System.out.println(objClass1.protectedField);
        System.out.println(objClass1.publicField);
    }
}
