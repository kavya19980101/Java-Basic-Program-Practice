package JavaPractices;

import java.util.Scanner;

public class Practice01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println("Enter the Y value");
        double y = sc.nextDouble();
        System.out.println("Enter the Z value");
        double z = sc.nextDouble();
      double Result= Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println("Result is "+Result );
        sc.close();


    }
}