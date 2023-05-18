package Polymorphism.Methodoverriding;

public class Circle extends Shape{
private double r;
    Circle(double r)
    {
        this.r=r;
    }

    public double getArea() {
        System.out.println("circle");
        return 3.14*r*r;
    }
}
