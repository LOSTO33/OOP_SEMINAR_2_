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

    @Override
    public void startSwimming() {

    }

    @Override
    public void stopSwimming() {

    }

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
}
