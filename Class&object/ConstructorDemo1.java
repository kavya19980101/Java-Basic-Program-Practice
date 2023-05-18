package OOPSConcepts.ClassandObjectsExamples;

public class ConstructorDemo1 {

int age;
String name;
    ConstructorDemo1(String name1,int age1)
    {
        this.name=name1;
        this.age=age1;
        System.out.println("My name is" +this.name);
        System.out.println("My age is"+this.age);
    }



}
