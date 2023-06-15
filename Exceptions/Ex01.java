package Exceptions;

public class Ex01 {
    public static void main(String[] args) {

            String sh = args[0];//Argument is not mention so Array index out of bound exception will occured
            int x = Integer.parseInt(sh);//If String value is mentioned as Ten then Numberformat Exception will thrown
            int a = 10 / x;//When value is 0 or ten then is divided then it will thrown as Arithmetic Exceptions
            System.out.println(x);
            System.out.println(a);



    }
}
