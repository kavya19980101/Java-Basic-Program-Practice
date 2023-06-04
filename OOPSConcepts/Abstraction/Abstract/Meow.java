package OOPSConcepts.Abstraction.Abstract;

public class Meow extends Animal{
    @Override
    void say() {
        System.out.println(getClass().getSimpleName()+" Meow says");
    }
}
