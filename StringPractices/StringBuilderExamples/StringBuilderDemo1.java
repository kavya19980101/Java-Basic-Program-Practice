package StringPractices.StringBuilderExamples;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder str1=new StringBuilder("TTA");
        StringBuilder str2=new StringBuilder("TTA");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.toString().equals(str1.toString()));
        System.out.println(str1.toString().contentEquals(str2.toString()));
        str1.append(" Kavya");
        System.out.println(str1);
        str1.reverse();
        System.out.println(str1);
    }

}
