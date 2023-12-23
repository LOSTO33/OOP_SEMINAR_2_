public abstract class Vehicle {
    protected int id;
    protected String brand;
    protected String Model;
     protected int yer;
    protected int maxFuel;


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
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getYer() {
        return yer;
    }

    public void setYer(int yer) {
        this.yer = yer;
    }

    public abstract void startEngine();
    public  abstract void stopEngine();
    public  abstract void accelerate(int speed);
    public abstract void brake();
    public void displayInfo(){
        System.out.println("Модель транспортного средства:  "+ getModel()+ "\nБренд Транспортного средства: "+ getBrand()+"Yer: "+getYer()+"ID: "+ getId());
    }

}
