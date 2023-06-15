package Exceptions;

public class Ex02 {
    public static void main(String[] args) {
        try {
            String name = null;
            name.trim();
        }
        catch(Exception e){
         e.printStackTrace();
        }
        System.out.println("Hello World");
    }
}
