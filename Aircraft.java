import java.lang.foreign.StructLayout;

/**
 *
 * Класс Aircraft (самолеты):
 * Наследует от Vehicle.
 * Реализует методы абстрактного класса displayInfo.
 * Реализует методы интерфейса Flyable.
 * Добавляет свойства: int maxAltitude (максимальная высота полета),
 * boolean isFlying (флаг состояния полета).
 * Реализует методы:
 * void startEngine() - запуск двигателя самолета.
 * void stopEngine() - остановка двигателя самолета.
 * void takeOff() - взлет самолета.
 * void land() - посадка самолета.
 * */


public class Aircraft extends Vehicle implements Flyable{
    int maxAltitude;
    boolean isFlying;

    public Aircraft(int id, String brand, String model, int year, int maxAltitude){
        setId(id);
        setBrand(brand);
        setModel(model);
        setYear(year);
        this.maxAltitude = maxAltitude;
    
    }

    @Override
    public void accelerate(int speed) {
        if ( isActiveEngine()){
            System.out.println("Самолет летит со скоростью: " + speed);
        }
    }

    @Override
    public void brake() {
        System.out.println("Самолет остановлена");

    }

    @Override
    public void displayInfo() {
        System.out.println("Aircraft{" +
                "id=" + getId() +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() + '\''+"maxAltitude= "+maxAltitude);

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

    @Override
    public void takeOff() {
       isFlying(true);
            maxAltitude+=2;
            System.out.println("Самолет взлетает");
        }
    private void isFlying(boolean b) {
    }

    @Override
    public void land() {
    isFlying(false);
    maxAltitude-=1;
    System.out.println("Самолет садится");
    }
}
