package StringPractices.StringBuilderExamples;

public class StringBuilderDemo2 {
    public static void main(String args[])
    {
        StringBuilder str1=new StringBuilder("Kavya");
        System.out.println(str1.append("Sheka"));//Appends the specified character or object to the end of the string.
        String Designation=" Test Engineer";
        System.out.println(str1.insert(11,Designation));//Inserts the specified character or object at the specified index in the string
        System.out.println(str1.delete(2,4));//Deletes the characters from the string between the specified start and end indices.
        System.out.println(str1.deleteCharAt(2));//Deletes the character at the specified index in the string.
        System.out.println(str1.replace(0, 2, "Kavya"));//Replaces the characters in the string between the specified start and end indices with the specified string.
        System.out.println(str1.substring(0,5));//Returns a substring of the string between the specified start and end indices.
        System.out.println(str1.reverse());//Reverses the order of the characters in the string.
        System.out.println(str1.charAt(0));//Returns the character at the specified index in the string.
        System.out.println(str1.length());//Returns the length of the string.
        str1.setCharAt(1, 'x');//Sets the character at the specified index in the string to the specified character.
        System.out.println(str1);
        System.out.println(str1.capacity());
////////



    }
}
