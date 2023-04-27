package ScannerClassExample;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Your name is " + name);
        System.out.println("Enter Your age");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);
        sc.close();
    }
}