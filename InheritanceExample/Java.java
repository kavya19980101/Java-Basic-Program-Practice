package InheritanceExample;

public class Java extends Programming{

        String NewFeature;
        Java(int version, String author, String NewFeature)
        {
            super(version,author);
         this.NewFeature=NewFeature;
        }
        void Printinformation()
        {
            this.PrintDetails();
            System.out.println("New feature added"+NewFeature);
        }

}
