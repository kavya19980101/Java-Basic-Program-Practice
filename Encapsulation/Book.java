package Encapsulation;

public class Book {
   private String TitleofBook;
   private int NoofCopiesSold;

   public String getTitle()
   {
       return TitleofBook;
   }
   public void setTitle(String TitleofBook)
   {
this.TitleofBook=TitleofBook;
   }

   public int getNoofCopiesSold(){
       return NoofCopiesSold;
   }
   public void SetNocopiessold(int NoofCopiesSold) {

       if (NoofCopiesSold > 0) {
           this.NoofCopiesSold = NoofCopiesSold;
       } else
           System.out.println("You cant set Invalid values");

   }
   }
