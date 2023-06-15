package Wrapper;

public class WP03 {
    public static void main(String[] args) {
        //String to primitive conversion
        //parseX()

        String str1="123";
        int x=Integer.parseInt(str1);
        System.out.println(x);

        //3)A)   Convert Primitive to Wrapper object using Constructor of Wrapper class
        int a=100;
        Integer I1=new Integer(a);

        //3)B)  Convert Primitive to Wrapper object usin Value of method of Wrapper class
        int b=200;
        Integer I2=Integer.valueOf(b);

        //4)a) Wrapper object to Primitive using xxValueO method of wrapper class
        int c=I2.intValue();
        System.out.println(c);

     //   //5) a) String to Wrapper Object using Consturctor of Wrapper classes
     //   String str2="Hello";
     //   Integer str3=new Integer(str2);


        //5) b) String to Wrapper object using valuef method of wrapper class
        String s1=new String("123");
       Integer s2=Integer.valueOf(s1);
        System.out.println(s2);

        //6)  a) Wrapper object to String

Integer s3=new Integer(134);
String s4=Integer.toString(s3);
System.out.println(s4);

         }
}
