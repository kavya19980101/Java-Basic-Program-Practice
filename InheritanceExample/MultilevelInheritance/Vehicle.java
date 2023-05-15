package InheritanceExample.MultilevelInheritance;

public class Vehicle {
    int seat;
    String engine_type;
    int speed;

    Vehicle(int speed)
    {
        this.speed=speed;
    }

    void topspeed()
    {
        System.out.println("the top speed of the vehicle is "+this.speed);
    }
}
