package OOPSConcepts.Polymorphism.Methodoverloading;

public class Person {
    void printTye(byte a){
        System.out.println(a+ " is a byte");
    }
    void printTye(int a){
        System.out.println(a+ " is a int");
    }
    void printTye(long a){
        System.out.println(a+ " is a long");
    }
    void printTye(float a){
        System.out.println(a+ " is a float");
    }
    void printTye(double a){
        System.out.println(a+ " is a double");
    }
    void printTye(char a){
        System.out.println(a+ " is a char");
    }
    void printTye(String a, char x){
        System.out.println("Multiple Parameters");
    }
}
