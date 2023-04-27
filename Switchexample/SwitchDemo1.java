package Switchexample;

public class SwitchDemo1 {
    public static void main(String args[])
    {
       byte a=70;
        final int X=65;
        switch(X) {
            case 10:
                System.out.println("TEN");
            case 300:
                System.out.println("X value is 30");
            case 5+30+30:
                System.out.println("Swenthy");
            case 1000:
                System.out.println("ASCII VALUE OF 'A' IS 65");
                break;
            default:
                System.out.println("Default value");
        }
        System.out.println("End of program");
    }
}
