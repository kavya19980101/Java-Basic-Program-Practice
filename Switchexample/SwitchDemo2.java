package Switchexample;

public class SwitchDemo2 {
public static void main(String args[])
{
    char ch='A';
    if(ch>=65 && ch<=90) {
        switch (ch){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("Characters are vowels");
            break;

    }}
    else{
        System.out.println("Character is consonent");
        }
}
}
