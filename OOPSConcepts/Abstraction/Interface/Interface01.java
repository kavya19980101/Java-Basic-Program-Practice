package OOPSConcepts.Abstraction.Interface.icanfly;

public interface Interface01 {
    public static void main(String[] args) {
        Hello h=new Hello();

        I1 i=new Hello();
        
    }
}

interface I1
{
void say();
default void hello()
{
    System.out.println("HEllo Default");
}
}
class Hello implements I1 {

    @Override
    public void say() {

    }

}