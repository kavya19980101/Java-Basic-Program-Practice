package Polymorphism.Methodoverriding;

public class Rectangle extends Shape{
    private double l;
            private double h;
    Rectangle(double l,double h)
    {
        this.h=h;
        this.l=l;
    }

    public double getArea() {
        System.out.println("rectangle");
        return l*h;
    }
}
