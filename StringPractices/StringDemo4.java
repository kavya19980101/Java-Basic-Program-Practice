package StringPractices;

public class StringDemo4 {
    public static void main(String args[])
    {
        String str1="TTA";
        String str2="TTA";
        String str3="TTa";
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str2.equalsIgnoreCase(str3));
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));
        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str2));
    }
}
