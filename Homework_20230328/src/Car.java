import java.text.DecimalFormat;

public class Car {
    String brand;
    String model;
    String color;
    float engineCapacity;
    float price;
    int year;

    public Car(String brand, String model, String color, float engineCapacity, float price, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.price = price;
        this.year = year;
    }

    public void printInfo() {
        System.out.println("Марка автомобиля: " + brand + "\n" +
                "Модель: " + model + "\n" +
                "Цвет: " + color + "\n" +
                "Объем двигвтеля: " + engineCapacity + "\n" +
                "Год выпуска: " + year + "\n" +
                "Цена: " + new DecimalFormat("#.##" ).format(price) + "€");
    }
}
