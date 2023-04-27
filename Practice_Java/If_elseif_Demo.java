package Practice_Java;

public class If_elseif_Demo {
    public static void main(String args[])
    {
        int a=30, b=20, c=10, max;
        if (a>b && a>c)
            max = a;
        else if(b>a && b>c)
            max = b;
        else
            max = c;

                    System.out.println("Max value is "+max);
    }
}

