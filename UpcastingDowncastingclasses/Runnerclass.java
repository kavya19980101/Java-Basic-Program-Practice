package UpcastingDowncastingclasses;

public class Runnerclass {
    P1 p=new P1();
    Child c=new Child();
   P1 p1=new Child();//valid upcasting
   Child c1=p1;//Invalid
    Child c2=(Child)p1;//Valid down-casting
}
