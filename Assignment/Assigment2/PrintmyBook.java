package Assignment.Assigment2;

public class PrintmyBook extends Book{

    PrintmyBook(String name, String author, int price) {
        this.name=name;
        this.author=author;
        this.price=price;
    }

    @Override
    void getDetails() {
    System.out.println(name+" "+author+" "+price);
    }

    public static void main(String[] args) {
        Book mybook=new PrintmyBook("Horry potter", "J.K.Rowling" ,100);
    mybook.getDetails();
        ;
    }
}
