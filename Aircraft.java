/**
 *
 * Класс Aircraft (самолеты):
 * Наследует от Vehicle.
 * Реализует методы абстрактного класса displayInfo.
 * Реализует методы интерфейса Flyable.
 * Добавляет свойства: int maxAltitude (максимальная высота полета), boolean isFlying (флаг состояния полета).
 * Реализует методы:
 * void startEngine() - запуск двигателя самолета.
 * void stopEngine() - остановка двигателя самолета.
 * void takeOff() - взлет самолета.
 * void land() - посадка самолета.
 * */


public class Aircraft extends Vehicle implements Flyable{
    int maxAltitude;
    boolean isFlying;

    @Override
    public void accelerate(int speed) {

    }

    @Override
    public void brake() {

    }

    @Override
    public void displayInfo() {

    }

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }
}
