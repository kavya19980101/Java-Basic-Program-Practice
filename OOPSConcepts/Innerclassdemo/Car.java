package OOPSConcepts.Innerclassdemo;

public class Car {
    String make;

    public Car(String make) {
        this.make = make;
    }
    void drive()
    {
        System.out.println("You can drive Car");
    }

    public class Engine{
        String horsepower;

        public Engine(String horsepower) {
            this.horsepower = horsepower;
        }


        void start()
        {
            System.out.println("Engine is started!!  " +make);
        }
    }
}
