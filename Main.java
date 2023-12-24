/**
```задание, включающее в себя использование абстрактных классов, интерфейсов и принципов ООП (инкапсуляции, наследования и полиморфизма):

        Задание: Разработка системы управления транспортными средствами

        Создайте систему управления транспортными средствами с использованием принципов объектно-ориентированного программирования. В системе должны присутствовать следующие классы и интерфейсы:

        1)Абстрактный класс Vehicle
        2)Интерфейс Flyable (летающие транспортные средства)
        3)Класс Car (автомобили)
        4)Класс Aircraft (самолеты)
        5)Класс Boat (лодки)
        6)Главный класс Main для проверки

        Главный класс Main для проверки:
        Создайте объекты различных транспортных средств (автомобиль, самолет, лодка).
        Продемонстрируйте их работу, вызывая соответствующие методы (запуск двигателя, движение, взлет, посадка и т.д.).
        Выведите информацию о каждом транспортном средстве с использованием метода displayInfo.
**/

public class Main {
    public static void main(String[]args){
        Car mers = new Car(1, "Mers", "ML", 2002,80);
        mers.displayInfo();
        mers.startEngine();
        mers.accelerate(60);
        mers.brake();
        mers.stopEngine();
        mers.refuel(5);
        System.err.println();
        Boat kater = new Boat(1,"Super","XL",2023);
        kater.displayInfo();
        kater.startEngine();
        kater.accelerate(30);
        kater.brake();
        kater.stopEngine();
        kater.startSwimming();
        kater.stopSwimming();
        System.err.println();
        Aircraft boing = new Aircraft(1, "Super", "XL", 2023, 1000);
        boing.displayInfo();
        boing.startEngine();
        boing.accelerate(70);
        boing.brake();
        boing.stopEngine();
        boing.takeOff();
        boing.land();
    }
}

