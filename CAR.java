public class CAR extends Vehicle{
    int fuelCapacity;
    int currentFuelLevel;
    int liters;


    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }

    @Override
    public void accelerate(int speed){

    }
    @Override
    public void brake() {

    }


    public void refuel(int liters) {
        currentFuelLevel+=liters;
        }
    }

