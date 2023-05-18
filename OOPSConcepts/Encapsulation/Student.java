package OOPSConcepts.Encapsulation;

public class Student {
    private String Studentname;
    private int age;
    private String address;

    public String getStudentname()
    {
        return Studentname;
    }

    public int getage()
    {
        return age;
    }

    public String getAddress()
    {
        return address;
    }

    public void setStudentname(String Studentname)
    {
        this.Studentname=Studentname;
    }

    public void setage(int age)
    {
        this.age=age;
    }
    public void setaddress(String address)
    {
        this.address=address;
    }
}
