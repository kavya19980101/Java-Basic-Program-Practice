package Exceptions;

import java.io.FileInputStream;

public class Ex03 {
    public static void main(String[] args) {
//Checked Exception which throwwn during compiling or writing a code need to analysed and fixed using the compilation itself
        FileInputStream f1=new FileInputStream("dadsd");
    }
}
