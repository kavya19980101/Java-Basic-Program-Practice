package OOPSConcepts.Abstraction.Interface;

public class Hideclass implements IKavya {

    @Override
    public void print() {

    }

    @Override
    public void print2() {
        IKavya.super.print2();
    }
}
