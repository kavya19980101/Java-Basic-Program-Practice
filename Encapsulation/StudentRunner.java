package Encapsulation;

public class StudentRunner {
    public static void main(String[] args) {
        Student S1=new Student();
        S1.setStudentname("Kavya");
        S1.setage(25);
        S1.setaddress("No 76 2nd cross road Rajajinagar Bangalore-560021");
        System.out.println(S1.getStudentname());
        System.out.println(S1.getage());
        System.out.println(S1.getAddress());
    }
}
