/**
 * Класс Boat (лодки):
 * Наследует от Vehicle.
 * Реализует методы абстрактного класса displayInfo.
 * Реализует методы интерфейса Swimmable.
 * Добавляет свойства: int maxSpeed (максимальная скорость на воде), boolean isSailing (флаг состояния движения по воде).
 * Реализует методы:
 * void startEngine() - запуск двигателя лодки.
 * void stopEngine() - остановка двигателя лодки.
 * void startSwimming() - начало движения лодки по воде.
 * void stopSwimming() - прекращение движения лодки по воде.
 */

public class Boat extends Vehicle implements Swimmble{
    int maxSpeed;
    boolean isSailing;
    public Boat(int id, String brand, String model, int year) {
        setId(id);
        setBrand(brand);
        setModel(model);
        setYear(year);
    }
        
        
        @Override
    public void startSwimming(){
        isSailing(true);
        System.out.println("Лодка начала движение ");
        maxSpeed+=1;

    }

    private void isSailing(boolean b) {
    }

    @Override
    public void stopSwimming() {
        isSailing(false);
        System.out.println("Лодка прекратила движение");
        maxSpeed-=1;

    }

    @Override
    public void accelerate(int speed) {
        if (isActiveEngine()) {
            System.out.println("Лодка двигается со скоростью: " + speed);
        }
        else System.out.println("Требуется запустить двигатель");

    }

    @Override
    public void brake() {
        System.out.println("Лодка остановлена");

    }

    @Override
     public void displayInfo() {
        System.out.println("Boat{" +
                "id=" + getId() +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() + '\'' +'}');


    }

    @Override
    public void startEngine() {
        setActiveEngine(true);
        System.out.println("Двигатель запущен!");

    }

    @Override
    public void stopEngine() {
        setActiveEngine(false);
        System.out.println("Двигатель остановлен!");
    }
}

