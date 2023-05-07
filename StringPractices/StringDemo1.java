package StringPractices;

public class StringDemo1 {
    public static void main(String args[])
    {
        //Assignment Operator
        String name ="The Testing Academy course";
                 /*String is a Sequence of character*/
                 /*String is a Built in class in Java.lang package*/
        System.out.println(name.length());//To find the length of the string we use length method
        System.out.println(name.charAt(4));//It returns character present in string at 4th Position
        System.out.println(name.concat("s"));//It concatenate the value of name with given character or string
        System.out.println(name.contains("course"));//It will return value as true/false
        System.out.println(name.equals("course"));//Returns true if the string is equal to the specified object, otherwise false.
        System.out.println(name.equalsIgnoreCase("the testing academy Course"));//Returns true if the string is equal to the specified string, ignoring case differences, otherwise false.
        System.out.println(name.indexOf('i'));//Returns the index of the first occurrence of the specified character in the string, or -1 if the character is not found.
        System.out.println(name.replace('t','a'));//Returns a new string resulting from replacing all occurrences of the specified oldChar with the specified newChar.
        System.out.println( "hello".substring(1, 3) );//Returns a new string that is a substring of the original string, starting from the specified beginIndex and ending at the endIndex (exclusive).
        System.out.println( "HELLO".toLowerCase());//Returns a new string with all characters converted to lowercase.
        System.out.println( "hello".toUpperCase() );//Returns a new string with all characters converted to uppercase.

    }
}
