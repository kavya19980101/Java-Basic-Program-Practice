package StringPractices;

public class StringDemo2 {
    public static void main(String args[])
    {
        String name="Kavya";//String pool area
        String name1="Kavya";//String pool area
        String name2=new String("Kavya");//Heap memory
        System.out.println(name == name1);
System.out.println(name.equals(name1));
System.out.println(name1.equals(name2));
        System.out.println(name1.equalsIgnoreCase(name2));
        System.out.println(name1 == name2);
    }
}
