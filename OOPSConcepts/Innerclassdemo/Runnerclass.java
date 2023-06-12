package OOPSConcepts.Innerclassdemo;

public class Runnerclass {
    public static void main(String[] args) {
        Car c=new Car("lambo");
   Car.Engine e=c.new Engine("100");
   e.start();
        c.drive();
    }
}
