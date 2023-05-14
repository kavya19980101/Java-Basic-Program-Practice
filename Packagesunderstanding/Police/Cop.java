package Packagesunderstanding.Police;

public class Cop {

    int gun;

    public Cop(int gun)
    {
        this.gun=gun;
    }

    protected int getshots()
    {
        return gun;
    }

    protected void CaniShoot()
    {
        System.out.println("Yes u can shoot");
    }
}
