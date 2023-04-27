package Switchexample;

import java.util.Scanner;

public class SwitchDemoMultiplecode {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);

            int itemcode;
            itemcode= scanner.nextInt();

            switch (itemcode) {
                case 001 :
                    System.out.println("Electronic Gadgets");
                    break;
                case 004 :
                        System.out.println("Mobile Gadgets");
                    break;
            }
    }
}
