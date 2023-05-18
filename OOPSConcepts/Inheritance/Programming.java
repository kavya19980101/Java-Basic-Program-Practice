package OOPSConcepts.Inheritance;

public class Programming {
    int version;
    String author;

     Programming(int version, String author)
     {
         this.version=version;
         this.author=author;
     }

     void PrintDetails(){
         System.out.println("The Programming language created by"+author+"With version"+version);
     }
}
