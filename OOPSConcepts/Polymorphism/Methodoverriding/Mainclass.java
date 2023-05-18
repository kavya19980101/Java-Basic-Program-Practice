package OOPSConcepts.Polymorphism.Methodoverriding;

public class Mainclass {
    public static void main(String[] args) {
        Shape shape=new Shape();
        Shape shape1=new Shape();
       shape=new Circle(30);
        double c=shape.getArea();
        System.out.println(c);
       shape1=new Rectangle(2,3);
        double r=shape1.getArea();
        System.out.println(r);
       ;


    }
}
