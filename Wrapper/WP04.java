package Wrapper;

public class WP04 {
    public static void main(String[] args) {
        work w=new work();
        byte a=100;
        byte b=90;
        w.show(a,b);
    }



}
class work{
    void show(int a, int b)
    {
System.out.println("the value of int "+a+" "+b);
    }
    void show(byte a,int b)
    {
        System.out.println("the value of byte "+a+" "+b);
    }
    void show(double a, double b)
    {
        System.out.println("the value of double " +a+" "+b);
    }
    void show(long a, long b)
    {
        System.out.println("the value of long "+a+" "+b);
    }
}
