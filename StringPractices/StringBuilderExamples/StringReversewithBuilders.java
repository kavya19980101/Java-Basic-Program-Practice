package StringPractices.StringBuilderExamples;

import java.util.Scanner;

public class StringReversewithBuilders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str1;
        System.out.println("Enter a String");
        str1= new StringBuilder(sc.nextLine());
        str1.reverse();
                System.out.println("The Reverse String is "+str1);
        System.out.println("The length of String is "+str1.length());
    }
}
