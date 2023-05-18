package Hasa_demo;

public class Driver {
    private String name;
    private Vehicle vehicle;


    public String ShowdriverDescription(Vehicle v) {
        return "Driver{" +
                "name='" + name + '\'' +
                "," + v.Show() +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Driver(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }
}
