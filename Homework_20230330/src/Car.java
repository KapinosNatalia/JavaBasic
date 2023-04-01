// 1) Создать класс Car c приватными полями, двумя конструкторами, aксессорами для полей и методом(процедурой)
// out для вывода всех полей класс на консоль
public class Car {
    private String brand;
    private String model;
    private String color;
    private float engineCapacity;
    private float price;
    private int year;

    // Конструкторы
    public Car(String brand, String model, String color, float engineCapacity, float price, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.price = price;
        this.year = year;
    }

    public Car(String brand, String model, float price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = "";
        this.engineCapacity = 1.2f;
        this.year = 2000;
    }

    // Акссессоры
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void out() {
        System.out.println("Марка автомобиля: " + brand + ", " +
                "модель: " + model + ", " +
                "цвет: " + color + ", " +
                "объем двигателя: " + engineCapacity + ", " +
                "год выпуска: " + year + ", " +
                "цена: " + price);
    }
}
