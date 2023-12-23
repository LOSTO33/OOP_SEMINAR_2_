
/**

 * Абстрактный класс Vehicle:
 * Содержит общие свойства и методы для всех видов транспортных средств.
 * Свойства: int id (уникальный идентификатор), String brand (марка), String model (модель), int year (год выпуска).
 * Методы:
 * void startEngine() - запуск двигателя (реализация в подклассах).
 * void stopEngine() - остановка двигателя (реализация в подклассах).
 * void accelerate(int speed) - увеличение скорости на указанное значение (реализация в подклассах).
 * void brake() - прекращение движения (реализация в подклассах).
 * abstract void displayInfo() - вывод информации о транспортном средстве (реализация в подклассах).

 * */
public abstract class Vehicle {
    private int id;
    private String brand;
    private String model;
    private int year;
    private boolean activeEngine;

    public boolean isActiveEngine() {
        return activeEngine;
    }

    public void setActiveEngine(boolean activeEngine) {
        this.activeEngine = activeEngine;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
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
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public abstract void accelerate(int speed);
    public abstract void brake();
    public abstract void displayInfo();
    public abstract void startEngine();
    public abstract void stopEngine();

}
