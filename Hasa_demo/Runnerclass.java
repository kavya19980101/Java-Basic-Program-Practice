package Hasa_demo;

public class Runnerclass {
    public static void main(String[] args) {
        Vehicle v=new Vehicle(10,"Tesla");
        Vehicle v1=new Vehicle(11,"Teslas");
        Driver d=new Driver("kavya",v1);
       String result= d.ShowdriverDescription(v1);
        String result1= d.ShowdriverDescription(v);

        System.out.println(result);
        System.out.println(result1);
}
}
