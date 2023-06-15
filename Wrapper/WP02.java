package Wrapper;

public class WP02 {
    public static void main(String[] args) {
        int x=123;
        //Convert int to String using valueof function
        String str=String.valueOf(x);
        System.out.println(str);

        //Convert int to String using Integer wrapper class and tostring funtion
        int y=345;
        String str1=Integer.toString(y);
        System.out.println(y);

        //Example of double
        double d=20.37;
        double d1=30.33;
        String str2=String.valueOf(d);
        String str3=Double.toString(d1);
        System.out.println(d);
        System.out.println(d1);


    }
}
