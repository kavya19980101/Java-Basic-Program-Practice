package OOPSConcepts.Innerclassdemo;

public class Runnerclass {
    public static void main(String[] args) {
        Car c=new Car("Lamborgini");
   Car.Engine e=c.new Engine("120");
   e.start();
        c.drive();
    }
}
