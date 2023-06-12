package OOPSConcepts.Innerclassdemo.Anonymousclass;

public class Runnerclass {

    A a=new A()
    {
public void show()
 {
     System.out.println("Iam from a class");
 }
        @Override
        public String toString() {
            return super.toString();
        }
    };

}

abstract class A{

}

interface B{

}
