package Polymorphism.Methodoverloading;

public class Mainclass {
    public static void main(String[] args) {
        Person P=new Person();
        P.printTye(10);
        P.printTye((byte)10);
        P.printTye(10.0f);
        P.printTye(10.34);
        P.printTye("Kavya", 'A');
        P.printTye('B');
    }
}
