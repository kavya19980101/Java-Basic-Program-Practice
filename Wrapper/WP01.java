package Wrapper;

public class WP01 {
    public static void main(String[] args) {
        char ch1='a';
        //Autoboxing primitive to Wrapper object convertion
         Character a1=ch1;
         Character a2='b';
         //unboxing Character object to Primitive conversion
         char b=a2;
         System.out.println(a1);
         System.out.println(b);
    }
}
