package OOPSConcepts.Encapsulation.Accessmodifier.Police;

public class Cop2 {
    public static void main(String[] args) {
        Cop C1=new Cop(100);
        C1.CaniShoot();
        System.out.println(C1.getshots());
    }
}
