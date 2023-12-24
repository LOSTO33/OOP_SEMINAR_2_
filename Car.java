
/**
 * Класс Car (автомобили):
 * Наследует от Vehicle.
 * Реализует методы абстрактного класса displayInfo.
 * Добавляет свойства: int fuelCapacity (емкость топливного бака), int currentFuelLevel (текущий уровень топлива).
 * Реализует методы:
 * void startEngine() - запуск двигателя автомобиля.
 * void stopEngine() - остановка двигателя автомобиля.
 * void accelerate(int speed) - увеличение скорости автомобиля на указанное значение.
 * void brake() - прекращение движения автомобиля.
 * void refuel(int liters) - заправка автомобиля (увеличение уровня топлива).
 * */
public class Car extends Vehicle{
    private int fuelCapacity;
    private int currentFuelLevel;

    public Car(int id, String brand, String model, int year, int fuelCapacity) {
        setId(id);
        setBrand(brand);
        setModel(model);
        setYear(year);
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = this.fuelCapacity;
    }
    @Override
    public void accelerate(int speed){
        if (isActiveEngine()) {
            currentFuelLevel -= speed / 4; // целочисленое деление
            System.out.println("Машина двигается со скоростью: " + speed);
        }
        else System.out.println("Требуется запустить двигатель");
    }
    @Override
    public void brake() {

        System.out.println("Машина остановлена");
    }

    @Override
    public void startEngine() {
        setActiveEngine(true);
        currentFuelLevel-=2;
        System.out.println("Двигатель запущен!");
    }

    @Override
    public void stopEngine() {
        setActiveEngine(false);
        System.out.println("Двигатель остановлен!");
    }

    public void refuel(int liters) {
        if (currentFuelLevel + liters <= fuelCapacity){
            currentFuelLevel += liters;
            System.out.println("Машина заправлена, текущий уровень топлива: " + currentFuelLevel);
        } else {
            System.out.println("Бак полон, " + (currentFuelLevel + liters - fuelCapacity) + "литров на земле");
            currentFuelLevel = fuelCapacity;
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Car{" +
                "id=" + getId() +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() + '\'' +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                '}');

    }
}

