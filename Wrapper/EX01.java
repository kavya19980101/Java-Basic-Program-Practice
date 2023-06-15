package Wrapper;

public class EX01 {
    public static void main(String[] args) {
        Integer a=200,b=400;

        //Wrapper class reference always will be not equal it will point to differents references
        if(a==b)
        {
            System.out.println("Is equal");
        }
        else {
            System.out.println("Not a equal");
        }
    }
}
